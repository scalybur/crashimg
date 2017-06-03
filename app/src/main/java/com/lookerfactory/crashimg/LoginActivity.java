package com.lookerfactory.crashimg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lookerfactory.crashimg.view.ContainerActivity;
import com.lookerfactory.crashimg.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goMainApp(View view)
    {
        Intent unIntent =  new Intent(this, ContainerActivity.class);
        startActivity(unIntent);
    }

    public void goCreateAccount(View view)
    {
        Intent aIntent = new Intent(this, CreateAccountActivity.class);
        startActivity(aIntent);

    }
}
