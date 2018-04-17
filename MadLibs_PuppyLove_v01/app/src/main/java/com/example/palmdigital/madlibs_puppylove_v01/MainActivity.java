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

        EditText et_noun = findViewById(R.id.et_Noun);
        String NounStr = et_noun.getText().toString();

        EditText et_verb = findViewById(R.id.et_Verb);
        String VerbStr = et_verb.getText().toString();

        EditText et_adjective = findViewById(R.id.et_Adjective);
        String AdjStr = et_adjective.getText().toString();

        EditText et_adjective2 = findViewById(R.id.et_Adjective2);
        String Adj2Str = et_adjective2.getText().toString();

        EditText et_verb2 = findViewById(R.id.et_Verb2);
        String Verb2Str = et_verb2.getText().toString();

        EditText et_noun2 = findViewById(R.id.et_Noun2);
        String Noun2Str = et_noun2.getText().toString();

        EditText et_noun3 = findViewById(R.id.et_Noun3);
        String Noun3Str = et_noun3.getText().toString();




        String story = " Today I saw him again. When he looks at me with those ";
        story = story + colorStr;
        story = story + " eyes, it makes my " ;
        story = story + bodypartStr;
        story = story + " go pitterpat, and I feel as if I have ";
        story = story + NounStr;
        story = story + " in my stomach. When he scrunches his nose, I want to ";
        story = story + VerbStr;
        story = story + " him so softly. He is so ";
        story = story + AdjStr;
        story = story + " and ";
        story = story + Adj2Str;
        story = story + " Tomorrow he will be mine. For now he ";
        story = story + Verb2Str;
        story = story + " in the store ";
        story = story + Noun2Str;
        story = story + " looking at me. ";
        story = story + Noun3Str;
        story = story + " love is hard to resist!";



        TextView output    = findViewById(R.id.tvStory);
        output.setText(story);
    }

}
