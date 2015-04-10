package com.example.simrankaur.projecttest1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivityDiveSafe extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent splash = new Intent(MainActivityDiveSafe.this, SplashScreen.class);
        startActivity(splash);
        setContentView(R.layout.activity_main_activity_dive_safe);
    }
    public void addButtonClickListener(View v) {
        Intent intent;
        intent = new Intent(MainActivityDiveSafe.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_dive_safe, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void diveprofile(View v) {

        startActivity(new Intent(MainActivityDiveSafe.this,MainActivity.class));
    }
}
