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
    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVars();
        addEventToBtn();

    }

    private void initializeVars() {
        btn = findViewById(R.id.btn1);
        tv = findViewById(R.id.textView);
        et = findViewById(R.id.et1);
    }

    private void addEventToBtn() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et.getText().toString();
                // Displaying the entered text;
                Toast.makeText(MainActivity.this, "Hello "+ name, Toast.LENGTH_LONG).show();
            }
        });
    }
}