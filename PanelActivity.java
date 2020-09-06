package com.example.carwatch;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class PanelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);
    }

    public void gotoAddCar(View view)
    {
        Intent i = new Intent(this, AddCarActivity.class);
        startActivity(i);
    }

    public void gotoCarList(View view)
    {
        Intent i = new Intent(this, CarListActivity.class);
        startActivity(i);
    }
}
