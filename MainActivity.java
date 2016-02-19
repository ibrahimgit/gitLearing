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

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void sendDummyMessage(View view) {
        Intent displayIntent = new Intent(this, DisplayMessageActivity.class);
        EditText ed = (EditText) findViewById(R.id.edit_message);
        String msg = ed.getText().toString();
        displayIntent.putExtra(EXTRA_MESSAGE, msg);
        startActivity(displayIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(), "Settings clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_search) {
            Toast.makeText(getApplicationContext(), "Search clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_nobo) {
            Toast.makeText(getApplicationContext(), "Nobo clicked", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
