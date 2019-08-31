package com.example.user.hostelm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    TextView tv2;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        tv2=findViewById(R.id.textView2);

        st=getIntent().getExtras().getString("value5");
        tv2.setText(st.toUpperCase());

    }


}
