package com.yiriba.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv, welcomeTxt;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVars();
        addEventToBtn();

    }

    private void initializeVars() {
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);
        welcomeTxt = findViewById(R.id.welcome_txt);
    }

    private void addEventToBtn() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(""+ increaseCounter());
            }
        });
    }

    private int increaseCounter() {
        return ++counter;
    }
}