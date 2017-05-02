package com.isd.refer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
      ToggleButton toggelbuttno1, togglebutton2;
      Button submitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOnClickListenerButton();
    }

public void setOnClickListenerButton(){
	
	toggelbuttno1 = (ToggleButton)findViewById(R.id.toggleButton1);
	togglebutton2 = (ToggleButton)findViewById(R.id.toggleButton2);
	
	submitbtn =(Button)findViewById(R.id.button1);
	
	submitbtn.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			StringBuilder result = new StringBuilder();
			
			result.append("ToggleButton1 :").append(toggelbuttno1.getText());
			result.append("\n ToggleButton2").append(togglebutton2.getText());
			
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