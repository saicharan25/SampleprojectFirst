package com.example.saicharan.sampleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_LONG).show();

        for(int i=0;i<=1;i++){
            Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_LONG).show();
        }

        Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_LONG).show();


       //completed in Github side changes editing
    }
}
