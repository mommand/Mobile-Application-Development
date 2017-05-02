package com.isd.scondui;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        Toast.makeText(getApplicationContext(),"This is Toast Message",Toast.LENGTH_LONG).show();
          Toast tstmessage = Toast.makeText(getApplicationContext(),"Toast message",Toast.LENGTH_LONG);
          
         tstmessage.setGravity(Gravity.BOTTOM|Gravity.RIGHT, 0,0);
          tstmessage.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}