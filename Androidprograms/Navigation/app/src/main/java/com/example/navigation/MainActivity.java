package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void movetopage(View v){
        Intent i = new Intent(this,SecondActivity.class);
        EditText e = findViewById(R.id.msg);
        EditText n1 = findViewById(R.id.num1);
        EditText n2 = findViewById(R.id.num2);
        int t1 = Integer.parseInt(n1.getText().toString());
        int t2 = Integer.parseInt(n2.getText().toString());
        int sum = t1+t2;
        String s = Integer.toString(sum);
        String cont = e.getText().toString();
        i.putExtra("content",cont);
        i.putExtra("Addition",s);
        startActivity(i);

    }
}