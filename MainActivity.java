package com.example.ibrahim.helloworld;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	//These are test change

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
	
	public void foo(){
		int i = 10;
		//do something
	}

    public void sendDummyMessage(View view) {
        Intent displayIntent = new Intent(this, DisplayMessageActivity.class);
        EditText ed = (EditText) findViewById(R.id.edit_message);
        String msg = ed.getText().toString();
        startActivity(displayIntent.putExtra(EXTRA_MESSAGE, msg););
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        

        View view = getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        
        int id = item.getItemId();

        
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(), "Settings clicked", Toast.LENGTH_SHORT).show();
            //return true;
        } else if (id == R.id.action_search) {
            Toast.makeText(getApplicationContext(), "Search clicked", Toast.LENGTH_SHORT).show();
            //return true;
        } else if (id == R.id.action_nobo) {
            Toast.makeText(getApplicationContext(), "Nobo clicked", Toast.LENGTH_SHORT).show();
            //return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
