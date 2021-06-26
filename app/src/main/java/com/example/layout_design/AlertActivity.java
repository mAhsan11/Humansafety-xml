package com.example.layout_design;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class AlertActivity extends AppCompatActivity {
    TextInputEditText tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        tv=findViewById(R.id.AA_TIET_contact);
    }
}