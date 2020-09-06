package com.example.carwatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoLogin(View view)
    {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

    public void gotoSignup(View view)
    {
        Intent a = new Intent(this, SignUpActivity.class);
        startActivity(a);

    }

		
		
	}

