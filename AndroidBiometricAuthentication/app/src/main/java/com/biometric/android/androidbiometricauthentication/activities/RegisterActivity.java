package com.biometric.android.androidbiometricauthentication.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.biometric.android.androidbiometricauthentication.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    private void initUIElements(){
        final Button fingerprintButton = (Button) findViewById(R.id.button_register_fingerprint);
        fingerprintButton.setOnClickListener(this);

        final Button faceRecognitionButton = (Button) findViewById(R.id.button_register_face);
        faceRecognitionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_register_fingerprint:
                // TODO
                break;
            case R.id.button_register_face:
                // TODO
                break;
        }
    }
}
