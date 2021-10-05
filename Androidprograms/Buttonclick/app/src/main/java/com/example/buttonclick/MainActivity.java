package com.example.buttonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin();

    }
    public void spin(){
        sp = findViewById(R.id.spinner);
        String[] daylist =getResources().getStringArray(R.array.days);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, daylist);
        sp.setAdapter(adapter);

    }
    public void display(View v){

        Toast.makeText(this, String.valueOf(sp.getSelectedItem()),Toast.LENGTH_LONG).show();
    }


}




