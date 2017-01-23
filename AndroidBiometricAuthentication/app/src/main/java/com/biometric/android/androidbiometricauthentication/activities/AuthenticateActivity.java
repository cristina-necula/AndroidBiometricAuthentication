package com.biometric.android.androidbiometricauthentication.activities;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.biometric.android.androidbiometricauthentication.R;

public class AuthenticateActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authenticate);
        initUIElements();
    }

    private void initUIElements(){
        final Button fingerprintButton = (Button) findViewById(R.id.button_fingerprint);
        fingerprintButton.setOnClickListener(this);

        final Button faceRecognitionButton = (Button) findViewById(R.id.button_face);
        faceRecognitionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.button_face:
                // TODO
                break;
            case R.id.button_fingerprint:
                intent = new Intent(this, FingerprintActivity.class);
                break;
        }
        assert intent != null;
        startActivity(intent);
    }

}
