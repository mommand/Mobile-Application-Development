package com.demo.searchbar;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.*;
import android.widget.SearchView.OnQueryTextListener;

public class MainActivity extends Activity {

	SearchView searchview;
	ListView listview;
	ArrayList<String> list;
	ArrayAdapter<String> adapter;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchview = (SearchView)findViewById(R.id.searchView);
        listview = (ListView)findViewById(R.id.lv1);
        
        list = new ArrayList<String>();
        list.add("Kachalo");
        list.add("Shalgaham");
        list.add("Payaiz");
        list.add("Kado");
        list.add("Bamya");
        list.add("Golpi");
        list.add("Palak");
        
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listview.setAdapter(adapter);
        
        searchview.setOnQueryTextListener(new OnQueryTextListener(){

			@Override
			public boolean onQueryTextChange(String query) {
				// TODO Auto-generated method stub
				if(list.contains(query)){
					adapter.getFilter().filter(query);
				}
				else{
					Toast.makeText(getApplicationContext(), "Data not Found", Toast.LENGTH_LONG).show();
				}
				
				return false;
			}

			@Override
			public boolean onQueryTextSubmit(String query) {
				// TODO Auto-generated method stub
				return false;
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
