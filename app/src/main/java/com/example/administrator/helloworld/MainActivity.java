package com.example.administrator.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"new Branch1",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Before",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"+++",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"hahaha",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"cccccc",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"new Branch2",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"new Branch2",Toast.LENGTH_SHORT).show();

    }
}
