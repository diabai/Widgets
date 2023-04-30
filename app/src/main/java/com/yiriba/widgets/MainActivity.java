package com.yiriba.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     Button conv;
     TextView resultTxt, appName;
     EditText editText;

    private final double POUND_BASE = 2.20462;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTxt = findViewById(R.id.result);
        appName = findViewById(R.id.tv_app_name);
        editText = findViewById(R.id.edittxt);
        conv = findViewById(R.id.btn);

        conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    double kg_entered = Double.parseDouble(editText.getText().toString());
                    resultTxt.setText("" + convertToLbs(kg_entered) + "lb");
                } catch(Exception e) {
                    Log.e("MainActivity", e.getMessage());

                }
            }
        });
    }

    private double convertToLbs (double kg) {
        return kg * POUND_BASE;
    }
}