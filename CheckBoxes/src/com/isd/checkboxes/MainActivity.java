package com.isd.checkboxes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {
	CheckBox pizza, burgar, coffee;
	Button orderButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		order();
	}
public void order(){
	pizza = (CheckBox)findViewById(R.id.checkBox1);
	burgar = (CheckBox)findViewById(R.id.checkBox2);
	coffee = (CheckBox)findViewById(R.id.checkBox3);
	
	orderButton = (Button)findViewById(R.id.button1);
	
	orderButton.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			int totalAmount = 0;
			
			StringBuilder str = new StringBuilder();
			str.append("Selected items");
			
			if(pizza.isChecked())
			{
				str.append("\n Pizza Price is: 600 Afs");
				totalAmount+= 600;
			}
			if(burgar.isChecked())
			{
				str.append("\n Burgar Price is: 120 Afs");
				totalAmount+= 120;
			}
			if(coffee.isChecked()){
				str.append("\n Coffee Price is: 40 Afs");
				totalAmount+= 40;
			}
		
			if(totalAmount != 0)
			{
					str.append("\n Total Amount: "+totalAmount+"Afs");
					
					Toast.makeText(getApplicationContext(), str.toString(), Toast.LENGTH_LONG).show();
				
				
			}
			
			else
			{
				Toast.makeText(getApplicationContext(), "No order selected", Toast.LENGTH_LONG).show();
			}
			
			
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
