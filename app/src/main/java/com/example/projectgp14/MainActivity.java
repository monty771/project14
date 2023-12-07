package com.example.projectgp14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lO = new Intent(MainActivity.this,);
                startActivity(lO);
            }
        });

        Button signup = (Button) findViewById(R.id.btn_signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sU = new Intent(MainActivity.this,);
                startActivity(sU);
            }
        });

        Button solar = (Button) findViewById(R.id.btn_solarpan);
        solar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(MainActivity.this,);
                startActivity(s);
            }
        });

        Button windfarms = (Button) findViewById(R.id.btn_windfarm);
        windfarms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent w = new Intent(MainActivity.this,);
                startActivity(w);
            }
        });

        Button elecCar = (Button) findViewById(R.id.btn_elcar);
        elecCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this,);
                startActivity(e);
            }
        });

        Button chargePoint = (Button) findViewById(R.id.btn_chargepoint);
        chargePoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cP = new Intent(MainActivity.this,);
                startActivity(cP);
            }
        });

    }
}