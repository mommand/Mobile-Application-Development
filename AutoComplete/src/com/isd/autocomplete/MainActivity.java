package com.isd.autocomplete;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
    String [] languages = {"C","C++","Android","java","ASP.NET","JSP","JSF","PHP","Phyton"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ArrayAdapter<String> adatper = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,languages);
        AutoCompleteTextView atv = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        atv.setThreshold(1); // starts from first character
        atv.setAdapter(adatper);
        atv.setTextColor(Color.BLUE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
