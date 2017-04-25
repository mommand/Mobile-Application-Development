package com.isd.cal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
//     EditText text1, text2;
//     Button sumbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
//        setListenerOnButton();
    }
//public void setListenerOnButton(){
//	text1 = (EditText)findViewById(R.id.editText1);
//	text2 = (EditText)findViewById(R.id.editText2);
//	
//	sumbtn = (Button)findViewById(R.id.button1);
//	
//	// set onclick listener on button
//	sumbtn.setOnClickListener(new OnClickListener(){
//
//		@Override
//		public void onClick(View arg0) {
//			// TODO Auto-generated method stub
//			String val1 = text1.getText().toString();
//			String val2 = text2.getText().toString();
//			
//			int a = Integer.parseInt(val1);
//			int b = Integer.parseInt(val2);
//			
//			int sum = a + b;
//			
//			Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
//			
//			
//		}
//		
//	});
//}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
