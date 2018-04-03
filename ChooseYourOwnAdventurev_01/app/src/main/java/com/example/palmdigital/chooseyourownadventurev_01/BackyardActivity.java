package com.example.palmdigital.chooseyourownadventurev_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BackyardActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backyard);
        Button buttonScreamObject = findViewById(R.id.buttonLeftScream);
        buttonScreamObject.setOnClickListener(this);
        Button buttonFaintObject = findViewById(R.id.buttonRightFaint);
        buttonFaintObject.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonLeftScream)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(this, EatenActivity.class);

                startActivity(i);
            }
        }
    }

