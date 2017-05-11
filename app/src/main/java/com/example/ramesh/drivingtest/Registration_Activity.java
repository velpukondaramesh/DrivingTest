package com.example.ramesh.drivingtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.ramesh.mysample.R;
import com.google.android.gms.ads.AdView;

/**
 * Created by Ramesh on 10-05-2017.
 */

public class Registration_Activity extends AppCompatActivity {

    EditText et_Name, et_Mail, et_Password;
    Button btn_signup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        MyAdView.SetAD((AdView) findViewById(R.id.adView));

        et_Name = (EditText) findViewById(R.id.editName);
        et_Mail = (EditText) findViewById(R.id.editEmail);
        et_Password = (EditText) findViewById(R.id.editPassword);

        btn_signup = (Button) findViewById(R.id.btn_signup);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
