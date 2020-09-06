package com.example.carwatch;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

@SuppressLint("NewApi")
public class SignUpActivity extends Activity {

    EditText txtName, txtUsername, txtPassword;
    CarsDB db;
    Intent hh;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initialize();
    }

    private void initialize()
    {
        txtName = (EditText)findViewById(R.id.txtNameSignup);
        txtUsername = (EditText)findViewById(R.id.txtUsernameSignup);
        txtPassword = (EditText)findViewById(R.id.txtPassword1st);
        db = new CarsDB(this);
    }

	public void gotoPanel(View view)
    {
        String name, username, password;

        name = txtName.getText().toString();
        username = txtUsername.getText().toString();
        password = txtPassword.getText().toString();

        if (username != null && !username.trim().isEmpty() && password != null &&
            !password.trim().isEmpty() && name != null && !name.trim().isEmpty()) {

            User user = new User();
            user.setName(name);;
            user.setUsername(username);
            user.setPassword(password);
            db.addUser(user);
            hh = new Intent(this, LoginActivity.class);
        }
        else
        {
            Toast.makeText(SignUpActivity.this, "Empty or incorrect name/user or password!", Toast.LENGTH_SHORT).show();
        }
    }
}
