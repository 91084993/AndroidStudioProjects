package com.example.palmdigital.edittext01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGetNameObject = findViewById(R.id.buttonGetName);
        buttonGetNameObject.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        EditText firstNameObject = (EditText) findViewById(R.id.et_firstName);
        String firstStr = firstNameObject.getText().toString();
        //Log.i("info", "First name is " + firstStr);

        EditText LastNameObject = (EditText) findViewById(R.id.et_lName);
        String LastStr = LastNameObject.getText().toString();

        String fullName = firstStr+ " " + LastStr;

        TextView tvOutput = findViewById(R.id.tvOutput);
        tvOutput.setText(firstStr);


    }

}
