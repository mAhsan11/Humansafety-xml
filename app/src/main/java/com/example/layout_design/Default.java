package com.example.layout_design;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class Default extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.logout_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.logout:
                logout();
                return true;

            case R.id.newAccount:
                Toast.makeText(this, "Clicked on New Account!!!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.update:
                Toast.makeText(this, "Clicked on Update Profile!!", Toast.LENGTH_SHORT).show();
                return  true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void logout(){
        Toast.makeText(this, "Successfully Logout!", Toast.LENGTH_SHORT).show();

    }
}