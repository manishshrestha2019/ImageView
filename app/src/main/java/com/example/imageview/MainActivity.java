package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private RadioButton rd1,rd2,rd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rd1=findViewById(R.id.rd1);
        rd2=findViewById(R.id.rd2);
        rd3=findViewById(R.id.rd3);

    }
}
