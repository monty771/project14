package com.example.projectgp14;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;

public class Sensor extends AppCompatActivity {
    SensorManager sensorManager;
    android.hardware.Sensor lightSensor;
    SensorEventListener lightEventListener;
    View root;
    float maxValue;

    @SuppressLint("MissingInflated")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);

        root  =  findViewById(R.id.root);
        sensorManager = (SensorManager)  getSystemService(SENSOR_SERVICE);
        lightSensor = sensorManager.getDefaultSensor(TYPE_LIGHT);

        andro





    }
}