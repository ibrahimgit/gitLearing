package com.example.ibrahim.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
			
        String msg = getIntent().displayIntent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        TextView txtvw = new TextView(this);
        txtvw.setTextSize(40);
        txtvw.setText(msg);

        setContentView(textView);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        //this is test     
        // testing pull request and code review
    }
	
	public void  bar() {
		//do nothing
	}
	
	public void  doStuff() {
		//do stuff
	}
	
	public void get() {
		//do what you want do
	}
	
	public void trySomething () {
		//try more something
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
