package com.example.palmdigital.madlibs_puppylove_v01;

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
        Button buttonMakeStory = findViewById(R.id.ButtonMakeStory);
        buttonMakeStory.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        EditText et_color = findViewById(R.id.et_color);
        String colorStr = et_color.getText().toString();

        EditText et_bodypart = findViewById(R.id.et_BodyPart);
        String bodypartStr = et_bodypart.getText().toString();


        String story = " Today I saw him again. When he looks at me with those ";
        story = story + colorStr;
        story = story + " eyes, it makes my " ;
        story = story + bodypartStr;
        

        TextView output    = findViewById(R.id.tvStory);
        output.setText(story);
    }

}
