package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void changeText(View v){
        TextView textField = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String newText = editText.getText().toString();
        textField.setText(newText);
    }
}