package com.example.carwatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    EditText  txtUsername, txtPassword;
    CarsDB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsername = (EditText)findViewById(R.id.txtUsername);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        db = new CarsDB(this);
    }

    public void gotoPanel(View view)
    {
        String username = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();

        if (username != null && !username.trim().isEmpty() && password != null && !password.trim().isEmpty()) {
            User user = db.getUser(username);
            if (user != null) {
                if (password.equals(user.getPassword())) {
                    Intent i = new Intent(this, PanelActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(LoginActivity.this, "Wrong Password!", Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(LoginActivity.this, "No such user!", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(LoginActivity.this, "Empty or incorrect user or password!", Toast.LENGTH_SHORT).show();
        }
    }
}
