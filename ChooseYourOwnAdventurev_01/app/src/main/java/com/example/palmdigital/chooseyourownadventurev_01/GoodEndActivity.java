package com.example.palmdigital.chooseyourownadventurev_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoodEndActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_end);
        Button buttonRestartObject = findViewById(R.id.buttonRestart);
        buttonRestartObject.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonRestart)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
