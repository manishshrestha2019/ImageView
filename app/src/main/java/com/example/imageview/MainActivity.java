package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RadioButton rdArya,rdJon,rdTyrion;
    private TextView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdArya=findViewById(R.id.rd1);
        rdJon=findViewById(R.id.rd2);
        rdTyrion=findViewById(R.id.rd3);
        ivImage.findViewById(R.id.ivImage);

        rdArya.setOnClickListener(this);
        rdJon.setOnClickListener(this);
        rdTyrion.setOnClickListener(this);




    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.rd1:
                break;
            case R.id.rd2:
                break;

            case R.id.rd3:
                break;
        }
    }
}

