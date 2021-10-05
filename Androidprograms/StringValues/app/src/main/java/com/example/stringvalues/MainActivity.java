package com.example.stringvalues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String[] dept_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);
        Spinner department = findViewById(R.id.dep);
        dept_name =getResources().getStringArray(R.array.dept);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,dept_name);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        department.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Login successful", Toast.LENGTH_LONG).show();
    }
}