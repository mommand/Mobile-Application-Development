package com.demo.explicitintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Activity_two extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		
		Bundle extra = getIntent().getExtras();
		String value = extra.getString("value1");
		
		Toast.makeText(getApplicationContext(), value, Toast.LENGTH_LONG).show();
		
		Button back = (Button)findViewById(R.id.button1);
		back.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),MainActivity.class);
				startActivity(i);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_two, menu);
		return true;
	}

}
