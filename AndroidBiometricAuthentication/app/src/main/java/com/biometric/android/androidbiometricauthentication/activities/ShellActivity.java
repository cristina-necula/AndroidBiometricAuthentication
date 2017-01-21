package com.biometric.android.androidbiometricauthentication.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.biometric.android.androidbiometricauthentication.R;

public class ShellActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shell);
        initUIElements();
    }

    private void initUIElements(){
        final Button registerButton = (Button) findViewById(R.id.button_register);
        registerButton.setOnClickListener(this);

        final Button authenticateButton = (Button) findViewById(R.id.button_authenticate);
        authenticateButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.button_authenticate:
                intent = new Intent(this, AuthenticateActivity.class);
                break;
            case R.id.button_register:
                intent = new Intent(this, RegisterActivity.class);
                break;
        }
        assert intent != null;
        startActivity(intent);
    }
}
