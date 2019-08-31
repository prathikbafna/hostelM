package com.example.user.hostelm;
import android.annotation.SuppressLint;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {
    TextView tv;
    EditText ee;
    String st,reverse,result;
    int len;
    Toolbar toolbar;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.textView);

       st=getIntent().getExtras().getString("value1");
       len=st.length();
       tv.setText("the lenght is " + String.valueOf(len));
      /* toolbar=findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);*/




    }


    /*public boolean onOptiosItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            finish();
        }
        return onOptiosItemSelected(item);
    }*/


   /* public void check_string(){
        st=getIntent().getExtras().getString("value");
        int lenght = st.trim().toLowerCase().length();
        tv.setText(len);

    }*/
}
