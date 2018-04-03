package com.example.palmdigital.simplecalcv03;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.exp;
import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//member variables
    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView tv_output;
    int num1;
    int num2;
    double result;
    int operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a reference to the XML UI TextView
        textViewNum1Display = findViewById(R.id.tvNum1Display);
        textViewNum2Display = findViewById(R.id.tvNum2Display);
        tv_output = findViewById(R.id.tv_output);


        //create a reference to the ImageViewXML UI elements

        ImageView imageView0 = findViewById(R.id.imageView_0);
        ImageView imageView1 = findViewById(R.id.imageView_1);
        ImageView imageView2 = findViewById(R.id.imageView_2);
        ImageView imageView3 = findViewById(R.id.imageView_3);
        ImageView imageView4 = findViewById(R.id.imageView_4);
        ImageView imageView5 = findViewById(R.id.imageView_5);
        ImageView imageView6 =  findViewById(R.id.imageView_6);
        ImageView imageView7 =  findViewById(R.id.imageView_7);
        ImageView imageView8 =  findViewById(R.id.imageView_8);
        ImageView imageView9 =  findViewById(R.id.imageView_9);
        ImageView imageView10 =  findViewById(R.id.imageView_10);
        ImageView imageView11 =  findViewById(R.id.imageView_11);
        ImageView imageView12 =  findViewById(R.id.imageView_12);
        ImageView imageView13 =  findViewById(R.id.imageView_13);
        ImageView imageView14 =  findViewById(R.id.imageView_14);
        ImageView imageView15 =  findViewById(R.id.imageView_15);
        ImageView imageView16 =  findViewById(R.id.imageView_16);
        ImageView imageView17 =  findViewById(R.id.imageView_17);
        ImageView imageView18 =  findViewById(R.id.imageView_18);
        ImageView imageView19 =  findViewById(R.id.imageView_19);
        ImageView imageView_plus = findViewById(R.id.imageView_plus);
        ImageView imageView_minus = findViewById(R.id.imageView_minus);
        ImageView imageView_times = findViewById(R.id.imageView_times);
        ImageView imageView_divide = findViewById(R.id.imageView_divide);
        ImageView imageView_expo = findViewById(R.id.imageView_expo);
        ImageView imageView_equals = findViewById(R.id.imageView_equals);

        //setting imageView Objects to be clickable
         imageView0.setOnClickListener(this);
         imageView1.setOnClickListener(this);
         imageView2.setOnClickListener(this);
         imageView3.setOnClickListener(this);
         imageView4.setOnClickListener(this);
         imageView5.setOnClickListener(this);
         imageView6.setOnClickListener(this);
         imageView7.setOnClickListener(this);
         imageView8.setOnClickListener(this);
         imageView9.setOnClickListener(this);
         imageView10.setOnClickListener(this);
         imageView11.setOnClickListener(this);
         imageView12.setOnClickListener(this);
         imageView13.setOnClickListener(this);
         imageView14.setOnClickListener(this);
         imageView15.setOnClickListener(this);
         imageView16.setOnClickListener(this);
         imageView17.setOnClickListener(this);
         imageView18.setOnClickListener(this);
         imageView19.setOnClickListener(this);
         imageView_plus.setOnClickListener(this);
         imageView_minus.setOnClickListener(this);
         imageView_times.setOnClickListener(this);
         imageView_divide.setOnClickListener(this);
         imageView_expo.setOnClickListener(this);
         imageView_equals.setOnClickListener(this);
    } // end of onCreate
    public void onClick(View view) {

        if (view.getId() == R.id.imageView_0) {
            textViewNum1Display.setText("0");
            num1 = 0;
        }
        else if (view.getId() == R.id.imageView_1) {
            textViewNum1Display.setText("1");
            num1 = 1;
        }
        else if (view.getId() == R.id.imageView_2) {
            textViewNum1Display.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.imageView_3) {
            textViewNum1Display.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.imageView_4) {
            textViewNum1Display.setText("4");
            num1 = 4;
        }
        else if (view.getId() == R.id.imageView_5) {
            textViewNum1Display.setText("5");
            num1 = 5;
        }
        else if (view.getId() == R.id.imageView_6) {
            textViewNum1Display.setText("6");
            num1 = 6;
        }
        else if (view.getId() == R.id.imageView_7) {
            textViewNum1Display.setText("7");
            num1 = 7;
        }
        else if (view.getId() == R.id.imageView_8) {
            textViewNum1Display.setText("8");
            num1 = 8;
        }
        else if (view.getId() == R.id.imageView_9) {
            textViewNum1Display.setText("9");
            num1 = 9;
        }
        else if (view.getId() == R.id.imageView_10) {
            textViewNum2Display.setText("0");
            num2 = 0;
        }
        else if (view.getId() == R.id.imageView_11) {
            textViewNum2Display.setText("1");
            num2 = 1;
        }
        else if (view.getId() == R.id.imageView_12) {
            textViewNum2Display.setText("2");
            num2 = 2;
        }
        else if (view.getId() == R.id.imageView_13) {
            textViewNum2Display.setText("3");
            num2 = 3;
        }
        else if (view.getId() == R.id.imageView_14) {
            textViewNum2Display.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView_15) {
            textViewNum2Display.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView_16) {
            textViewNum2Display.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageView_17)
        {
            textViewNum2Display.setText("7");
            num2 = 7;
        } else if (view.getId() == R.id.imageView_18)

        {
            textViewNum2Display.setText("8");
            num2 = 8;
        }
        else if (view.getId() == R.id.imageView_19)
        {
            textViewNum2Display.setText("9");
            num2 = 9;
        }
        else if (view.getId() == R.id.imageView_plus)
        {
            operation = '+';

        }
        else if (view.getId() == R.id.imageView_minus)
        {
            operation = '-';
        }
        else if (view.getId() == R.id.imageView_times)
        {
            operation = '*';
        }
        else if (view.getId() == R.id.imageView_divide)
        {
            operation = '/';
        }
        else if (view.getId() == R.id.imageView_equals)

        {
            if (operation == '+')

                result = num1 + num2;

            else if (operation == '-')

                result = num1 - num2;

            if (operation == '*')

                result = num1 * num2;


            else if (operation == '/')
                result = (double) num1 / num2;





            if(operation == '^')
                result = exp(num1, num2);


            tv_output.setText(" " + result);


        } // end of else if imageView_equals
       if (operation == '/' && num2 == 0) {
            Toast.makeText(this,"Division By Zero Doesn't Work!", Toast.LENGTH_SHORT).show();
        }




   } // end of public void

    public int exp ( int base, int exp) {
        int product = 1;
        for (int i = 0; i < exp; i++)
        {
            product = product * base;
        }

        return product;


    }
} // end of class
