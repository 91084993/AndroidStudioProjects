package com.example.palmdigital.chooseyourownadventurev_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);
        Button buttonHECKYESObject = findViewById(R.id.ButtonRightHECKYES);
        buttonHECKYESObject.setOnClickListener(this);
        Button buttonYesObject = findViewById(R.id.ButtonLeftYes);
        buttonYesObject.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.ButtonLeftYes)
        {
            Intent i = new Intent(this, GoodEndActivity.class);
            startActivity(i);
        }

        if(view.getId() == R.id.ButtonRightHECKYES)
        {
            Intent i = new Intent(this, GoodEndActivity.class);
            startActivity(i);
        }
    }
}
