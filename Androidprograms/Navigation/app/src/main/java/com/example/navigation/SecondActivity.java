package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent g = getIntent();
        String m = g.getStringExtra("content");
        TextView t = findViewById(R.id.m1);
        TextView res = findViewById(R.id.result);
        String r = g.getStringExtra("Addition");
        t.setText(m);
        res.setText(r);
        Toast.makeText(this, r,Toast.LENGTH_LONG).show();

    }
    public void movetoback(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}