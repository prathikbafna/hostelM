package com.example.user.hostelm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;
import android.content.Intent;


public class Main3Activity extends AppCompatActivity {

    TextView tv3, tv31;
    String st3;
    int a, count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //tv3=findViewById(R.id.textView3);
        tv31 = findViewById(R.id.textView31);
        st3 = getIntent().getExtras().getString("value3");
        a = Integer.parseInt(st3);


        //tv3.setText(a);
        for (int i = 1; i < a; i++) {
            if (a % i == 0)
                count++;
        }
        if (count == 1)
            tv31.setText("this is a prime number");
        else
            tv31.setText("this is not a prime number");





    }


}



