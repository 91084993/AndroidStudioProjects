package com.example.palmdigital.ceasarcipherv_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEncrypt  = findViewById(R.id.bt_Encrypt);
        btnEncrypt.setOnClickListener(this);

        Button btnDecrypt = findViewById(R.id.bt_Decrypt);
        btnDecrypt.setOnClickListener(this);

    }

public void onClick(View view)
    {
        //get the input string
        EditText et_enter = findViewById(R.id.et_Enter);
        String inputStr = et_enter.getText().toString();

        String theShiftStr = "";
        EditText et_shift = findViewById(R.id.et_Shift);
        theShiftStr += et_shift.getText().toString();
        int theShift = Integer.parseInt(theShiftStr);

        if (view.getId() == R.id.bt_Encrypt);
        {
            String encrypted = encrypt(inputStr, theShift);
            TextView output = findViewById(R.id.tv_Encrypted);
            output.setText(encrypted);
        }

        if(view.getId() == R.id. bt_Decrypt)
        {
            String decrypted = decrypt(inputStr, theShift);
            TextView output = findViewById(R.id.tv_Decrypted);
            output.setText(decrypted);
        }

    }


    public String encrypt(String input, int shift) {
    String output = "";
    int alphabetSize = 26;
    char[] alphabet = new char[alphabetSize];
    alphabet[0] = 'A';
    alphabet[1] = 'B';
    alphabet[2] = 'C';
    alphabet[3] = 'D';
    alphabet[4] = 'E';
    alphabet[5] = 'F';
    alphabet[6] = 'G';
    alphabet[7] = 'H';
    alphabet[8] = 'I';
    alphabet[9] = 'J';
    alphabet[10] = 'K';
    alphabet[11] = 'L';
    alphabet[12] = 'M';
    alphabet[13] = 'N';
    alphabet[14] = 'O';
    alphabet[15] = 'P';
    alphabet[16] = 'Q';
    alphabet[17] = 'R';
    alphabet[18] = 'S';
    alphabet[19] = 'T';
    alphabet[20] = 'U';
    alphabet[21] = 'V';
    alphabet[22] = 'W';
    alphabet[23] = 'X';
    alphabet[24] = 'Y';
    alphabet[25] = 'Z';
    input = input.toUpperCase();
    for (int i = 0; i < input.length(); i++)
    {
        char thisVal = input.charAt(i);
        if (thisVal == ' ')
        {
            output += ' ';
        }
        else
        {
            for (int j = 0; j < alphabetSize; j++)
            {
                if (alphabet[j] == thisVal)
                {
                    int shiftedIndex = (j + shift) % alphabetSize;
                    output += alphabet[shiftedIndex];
                }
            }
        }
    }
    return output;

}

    public String decrypt(String input, int shift)
    {
        String output = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++)
        {
            char thisVal = input.charAt(i);
            if (thisVal == ' ')
            {
                output += ' ';
            }
            else
            {
                for (int j = 0; j < alphabetSize; j++)
                {
                    if (alphabet[j] == thisVal)
                    {
                        int shiftedIndex = (j - shift + alphabetSize) % alphabetSize;
                        output += alphabet[shiftedIndex];
                    }
                }
            }
        }
        return output;
    }

}