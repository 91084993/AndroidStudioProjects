package com.example.palmdigital.scope01;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //
    int myInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // declare a local variable
        // dateType variableName <-- this is a local variable declaration

        //some examples of primitive types and declarations
        int myInt = 100;
        myInt = 200; // int is a Java primitive type
        double myDouble; // double is a Java primitive type
        char myChar;
        float myFloat;
        boolean myBool;
        long myLong;
        byte myByte;
        // these are not primitive they are classes
        String myString;
        Integer myInt2;
        Float myFloat2;
        Double myDouble2;
        // assign values to these variables
        myString = "this is an awesome string";
        myInt = 5;
        myDouble = 5.6;
        myFloat = 5.7f;
        myBool = true;
        myBool = false;
        myInt = awesomeMethod(myInt);
        Log.i("info", "myInt= " + myInt);
        TextView tv_Num1Display = findViewById(R.id.tv_top);
        TextView tv_Num2Display;

        ImageView iv_stuff;
        Button button;

        awesomeMethod2();



} // end of onCreate


    public int awesomeMethod(int input) {
        myInt = 10;
        awesomeMethod2();
        return input + 5;
    }

    public void awesomeMethod2() {
        System.out.println("myInt = " + myInt);
    }
} // end of MainActivity class
