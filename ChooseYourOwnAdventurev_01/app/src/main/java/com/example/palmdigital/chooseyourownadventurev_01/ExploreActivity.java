package com.example.palmdigital.chooseyourownadventurev_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        Button buttonToiletObject = findViewById(R.id.buttonRightToilet);
        buttonToiletObject.setOnClickListener(this);
        Button buttonBackyardObject = findViewById(R.id.buttonLeftBackyard);
        buttonBackyardObject.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonLeftBackyard)
        {
            Intent i = new Intent (this, BackyardActivity.class);
                    startActivity(i);
        }


    else
        {
            Intent i = new Intent(this, ToiletActivity.class);
            startActivity(i);
        }
    }

    }

