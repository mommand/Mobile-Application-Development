package com.isd.intentdemo;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText webPath;
	Button visit;
	Button Gotologin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GotoLoginPage();
        // load components from view
        webPath = (EditText)findViewById(R.id.editText1);
        visit   = (Button)findViewById(R.id.button1);
        
        visit.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String url = webPath.getText().toString();
				Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
				//invoke activity via intent
				startActivity(i);
				
			}
        	
        });
        
    }
public void GotoLoginPage(){
	Gotologin = (Button)findViewById(R.id.button2);
	Gotologin.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i = new Intent(getApplicationContext(),Login.class);
			startActivity(i);
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
