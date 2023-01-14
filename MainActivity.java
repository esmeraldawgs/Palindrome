package com.example.palindromeesmeralda;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText string;
    TextView result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        string = findViewById(R.id.string);
        result = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            String stringValue = string.getText().toString();
            checkPalindrome(stringValue);
        });
    }
    @SuppressLint("SetTextI18n")
    private void checkPalindrome(String stringValue) {
        String reversed = new StringBuilder(stringValue).reverse().toString();
        if(stringValue.equals(reversed))
        {
            result.setText("Palindrome");
        }
        else
        {
            result.setText("Not Palindrome");
        }
    }
}