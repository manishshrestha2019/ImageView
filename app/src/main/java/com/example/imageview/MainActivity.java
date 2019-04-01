package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RadioButton rdArya,rdJon,rdTyrion;
    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdArya=findViewById(R.id.rd1);
        rdJon=findViewById(R.id.rd2);
        rdTyrion=findViewById(R.id.rd3);
        ivImage=findViewById(R.id.ivImage);

        rdArya.setOnClickListener(this);
        rdJon.setOnClickListener(this);
        rdTyrion.setOnClickListener(this);
        ivImage.setOnClickListener(this);




    }
    @Override
    public void onClick(View v) {


        switch (v.getId()){
            case R.id.rd1:
                ivImage.setImageResource(R.drawable.arya);
//                Toast toastArya=Toast.makeText(this,"Arya",Toast.LENGTH_LONG);
//                toastArya.show();
                break;
            case R.id.rd2:
                ivImage.setImageResource(R.drawable.jonsnow);
//                Toast toastJon=Toast.makeText(this,"JON",Toast.LENGTH_LONG);
//                toastJon.show();
                break;

            case R.id.rd3:
                ivImage.setImageResource(R.drawable.tyrion);
//                Toast toastTyrion=Toast.makeText(this,"Tyrion",Toast.LENGTH_SHORT);
//                toastTyrion.show();
                break;
        }
    }
}

