package com.isd.ratingbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends Activity {
    RatingBar rating1;
    Button RateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rate();
    }
public void Rate(){
	rating1 = (RatingBar)findViewById(R.id.ratingBar1);
	RateButton = (Button)findViewById(R.id.button1);
	
	// create an event listener on Rate Button
	
	RateButton.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String Rate = String.valueOf(rating1.getRating());
			
			Toast.makeText(getApplicationContext(), Rate, Toast.LENGTH_LONG).show();
			
		}
		
	});
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
