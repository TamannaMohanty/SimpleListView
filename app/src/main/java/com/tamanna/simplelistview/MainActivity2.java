package com.tamanna.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView DisplayText;
    String displayTextStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        DisplayText = findViewById(R.id.DisplayTextView);

        displayTextStr =getIntent().getStringExtra("Display");

        DisplayText.setText(""+displayTextStr);
    }
}