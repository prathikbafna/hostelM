package com.example.user.hostelm;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btp,btpl,btc ;
    EditText prime,pali,caps;
    String palindrome,cap,pmstr;
    int pm;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prime=findViewById(R.id.check_prime);
        pali=findViewById(R.id.check_palindrome);
        caps=findViewById(R.id.all_caps);
        defineButtons();

    }



        public void defineButtons(){
            findViewById(R.id.button_palindrome).setOnClickListener(buttonClickListener);
             findViewById(R.id.button_prime).setOnClickListener(buttonClickListener);
            findViewById(R.id.button_aboutMe).setOnClickListener(buttonClickListener);
            findViewById(R.id.button_caps).setOnClickListener(buttonClickListener);
        }




        private View.OnClickListener buttonClickListener;


    {
        buttonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.button_palindrome:

                       Intent i=new Intent(MainActivity.this,Main2Activity.class);
                        palindrome=pali.getText().toString();
                        i.putExtra("value1",palindrome);
                        startActivity(i);
                        finish();

                        break;
                    case R.id.button_prime:

                        Intent j=new Intent(MainActivity.this,Main3Activity.class);
                        pmstr=prime.getText().toString();
                        j.putExtra("value3",pmstr);
                        startActivity(j);
                        finish();
                        break;

                    case R.id.button_caps:
                        Intent k=new Intent(MainActivity.this,Main5Activity.class);
                        cap=caps.getText().toString();
                        k.putExtra("value5",cap);
                        startActivity(k);
                        finish();
                        break;
                    case R.id.button_aboutMe:
                        startActivity(new Intent(MainActivity.this, Main4Activity.class)
                        );
                        break;
                }


            }
        };
    }



    }


