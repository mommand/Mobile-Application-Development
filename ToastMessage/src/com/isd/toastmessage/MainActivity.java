package com.isd.toastmessage;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
     Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        Toast tmessage = Toast.makeText(getApplicationContext(), "Welcome To This Applcation",Toast.LENGTH_LONG);
////        tmessage.setMargin(50, 50);
//        tmessage.setGravity(Gravity.TOP|Gravity.LEFT,0, 0);
//        tmessage.show();
        showmessage();
    }

public void showmessage(){
	btn = (Button)findViewById(R.id.button1);
	
	btn.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			Toast message = Toast.makeText(getApplicationContext(), "this is My Message",Toast.LENGTH_LONG);
			message.show();
			
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
