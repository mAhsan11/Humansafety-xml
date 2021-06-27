package com.example.layout_design;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class AlertActivity extends AppCompatActivity {

    TextInputLayout textInputLayout4;

    ArrayList<String> alertTypeList;
    ArrayAdapter<String> arrayAdapter_alertType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        textInputLayout4=findViewById(R.id.textInputLayout4);
        AutoCompleteTextView actv_alertType= (AutoCompleteTextView) findViewById(R.id.actv_alertType);
        alertTypeList=new ArrayList<>();

        alertTypeList.add("Disaster");
        alertTypeList.add("Theft");
        alertTypeList.add("Snatching");
        alertTypeList.add("Accident");
        alertTypeList.add("Murder");
        alertTypeList.add("Robbery");

        arrayAdapter_alertType = new ArrayAdapter<>(this,R.layout.alert_type_dropitems,alertTypeList);
        actv_alertType.setAdapter(arrayAdapter_alertType);
        actv_alertType.setThreshold(1);

    }
}