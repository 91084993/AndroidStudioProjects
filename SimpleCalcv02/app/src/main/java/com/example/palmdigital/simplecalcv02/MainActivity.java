package com.example.palmdigital.simplecalcv02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
//member variables
    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView textViewOutput;
    int num1;
    int num2;
    int result;
    int operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a reference to the XML UI TextView
        textViewNum1Display = findViewById(R.id.tvNum1Display);
        textViewNum2Display = findViewById(R.id.tvNum2Display);
        textViewOutput = findViewById(R.id.tv_output);

        //create a reference to the ImageViewXML UI elements

        ImageView imageView1 = findViewById(R.id.imageView_1);
        ImageView imageView2 = findViewById(R.id.imageView_2);
        ImageView imageView3 = findViewById(R.id.imageView_3);
        ImageView imageView4 = findViewById(R.id.imageView_4);
        ImageView imageView5 = findViewById(R.id.imageView_5);
        ImageView imageView6 = findViewById(R.id.imageView_6);
        ImageView imageView_plus_sign = findViewById(R.id.imageView_plus_sign);
        ImageView imageView_minus_sign = findViewById(R.id.imageView_minus_sign);
        ImageView imageView_equals = findViewById(R.id.imageView_equals);

        //setting imageView objects to be clickable
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView_plus_sign.setOnClickListener(this);
        imageView_minus_sign.setOnClickListener(this);
        imageView_equals.setOnClickListener(this);

    } // end of onCreate();
    public void onClick(View view)
    {
    if (view.getId() ==  R.id.imageView_1)
    {
        textViewNum1Display.setText("1");
        num1 = 1;
    }

    else if (view.getId() == R.id.imageView_2)
    {
        textViewNum1Display.setText("2");
        num1 = 2;
    }

    else if(view.getId() == R.id.imageView_3)
    {
        textViewNum1Display.setText("3");
        num1 = 3;
    }

    else if (view.getId() == R.id.imageView_4)
    {
        textViewNum2Display.setText("4");
        num2 = 4;
    }

    else if (view.getId() == R.id.imageView_5)
    {
        textViewNum2Display.setText("5");
        num2 = 5;
    }

    else if(view.getId() == R.id.imageView_6)
    {
        textViewNum2Display.setText("6");
        num2 = 6;
    }

    else if(view.getId() == R.id.imageView_plus_sign)
    {
        operation = '+';
    }


    else if(view.getId() == R.id.imageView_minus_sign)
    {
        operation = '-';
    }


    else if (view.getId() == R.id.imageView_equals)
    {
        if(operation == '+')

            result = num1 + num2;
       else if(operation == '-')

            result = num1 - num2;

        textViewOutput.setText(" " + result);


        }

    }



    }


