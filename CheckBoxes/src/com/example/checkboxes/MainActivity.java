package com.example.checkboxes;

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
    Button orderbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        order();
    }
    
    public void order(){
    		pizza = (CheckBox)findViewById(R.id.pizza);
    		burgar = (CheckBox)findViewById(R.id.burgar);
    		coffee = (CheckBox)findViewById(R.id.coffee);
    		
    		orderbutton = (Button)findViewById(R.id.button1);
    		
    		orderbutton.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					int totalamount = 0;
					StringBuilder str = new StringBuilder();
					str.append("Selected items:");
					if(pizza.isChecked()){
						str.append("\n Pizza Price is 600 Afs");
						totalamount +=600;
					}
					if(burgar.isChecked()){
						str.append("\n Burgar price is :180 Afs");
						totalamount +=180;
					}
					
					if(coffee.isChecked()){
						str.append("\n Coffee price is: 120 Afs");
						totalamount += 120;
					}
					
					str.append("\n Total amount:"+totalamount+ "Afs");
					
					
					Toast.makeText(getApplicationContext(), str.toString(), Toast.LENGTH_LONG).show();
					
					
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