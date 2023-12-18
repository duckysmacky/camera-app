package com.duckysmacky.cameraapp;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchCamera(View view) {
        Intent cameraActivity = new Intent(this, CameraActivity.class);
        startActivity(cameraActivity);
    }
}