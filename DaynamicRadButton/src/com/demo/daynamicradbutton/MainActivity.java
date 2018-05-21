package com.demo.daynamicradbutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.*;
import android.widget.RelativeLayout.LayoutParams;

public class MainActivity extends Activity {

	RadioGroup rg;  
    RelativeLayout rl;  
    RadioButton rb1,rb2;  
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
  
        rg = new RadioGroup(this);  
        rl = (RelativeLayout) findViewById(R.id.relativeLayout);  
        rb1 = new RadioButton(this);  
        rb2 = new RadioButton(this);  
  
        rb1.setText("Male");  
        rb2.setText("Female");  
        rg.addView(rb1);  
        rg.addView(rb2);  
        rg.setOrientation(RadioGroup.HORIZONTAL);  
  
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams((int) LayoutParams.WRAP_CONTENT,(int)LayoutParams.WRAP_CONTENT);  
        params.leftMargin =150;  
        params.topMargin = 100;  
  
        rg.setLayoutParams(params);  
        rl.addView(rg);  
  
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {  
            @Override  
            public void onCheckedChanged(RadioGroup group, int checkedId) {  
                RadioButton radioButton = (RadioButton) findViewById(checkedId);  
                Toast.makeText(getApplicationContext(),radioButton.getText(),Toast.LENGTH_LONG).show();  
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
