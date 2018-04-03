package com.example.palmdigital.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    // member variables
    int myInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        void myAwesomeMethod01()
    {
        int myInt = 1;
        double aDouble = 20.0;
        String aString = "hey there!";
        TextView myTv = null;
        ImageView myIV = null;
        Button myButton = null;
        myButton = findViewById(R.id.button_1);
    }

    void myAwesomeMethod02()
    {
        int myInt2;
        double aDouble2;
        String aString2;
        TextView myTv2;
        ImageView myIV2;
        Button myButton2;
    }

    void myAwesomeMethod03()
    {
        int myInt3;
        double aDouble3;
        String aString3;
        TextView myTv3;
        ImageView myIV3;
        Button myButton3;
    }

    void myAwesomeMethod04()
    {
        int myInt4;
        double aDouble4;
        String aString;
        TextView myTv;
        ImageView myIV;
        Button myButton;
    }

    void myAwesomeMethod05()
    {
        int myInt;
        double aDouble;
        String aString;
        TextView myTv;
        ImageView myIV;
        Button myButton;
    }
}
