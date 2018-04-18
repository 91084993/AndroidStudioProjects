package com.example.palmdigital.madlibs_pizza_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        EditText et_adj1       = findViewById(R.id.et_adjective1);
       String adj1Str          =  et_adj1.getText().toString();

       EditText et_nationality = findViewById(R.id.et_Nationality);
       String nationalityStr   = et_nationality.getText().toString();

       EditText et_name = findViewById(R.id.et_name);
       String nameStr = et_name.getText().toString();

       EditText et_noun1 = findViewById(R.id.et_noun1);
       String nounStr = et_noun1.getText().toString();

       String story            = " Pizza was invented by a ";
       story = story + adj1Str;
       story = story + " " + nationalityStr;
       story = story + " " + nameStr;
       story = story + " " + nounStr;

        TextView output         = findViewById(R.id.tvStory);
        output.setText(story);
    }

}
