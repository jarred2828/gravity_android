package com.android.gravity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button fbLoginButton;
    Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        fbLoginButton = (Button) findViewById(R.id.fbLoginButton);
        fbLoginButton.setOnClickListener(this);

        signUpButton = (Button) findViewById(R.id.signupButton);
        signUpButton.setOnClickListener(this);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(getBaseContext(), MainActivity.class);

        switch (v.getId()) {
            case R.id.fbLoginButton:
                //@Todo: Press facebook Log in button
                startActivity(intent);
                break;
            case R.id.signupButton:
                //@Todo: Press sign up button
                startActivity(intent);
                break;
            default:
                // Do nothing
                break;
        }
    }

        // Disable back button
    @Override
    public void onBackPressed()
    {
        return;
    }
}
