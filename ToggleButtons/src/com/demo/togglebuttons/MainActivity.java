package com.demo.togglebuttons;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
    private ToggleButton togglebutton1, toggelbutton2;
    private Button submitbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addButtonOnClick();
    }

public void addButtonOnClick(){
	// get  views 
	togglebutton1 = (ToggleButton)findViewById(R.id.toggleButton1);
	toggelbutton2 = (ToggleButton)findViewById(R.id.toggleButton2);
	
	submitbutton = (Button)findViewById(R.id.button1);
	
	submitbutton.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View view) {
			// TODO Auto-generated method stub
			StringBuilder result = new StringBuilder();
			result.append("Value 1 :").append(togglebutton1.getText());
			result.append("Value 2 :").append(toggelbutton2.getText());
		
			
			Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
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
