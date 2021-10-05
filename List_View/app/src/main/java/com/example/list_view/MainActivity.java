package com.example.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView mycountry;
    String countryList[] = {"India","ISRO","SPACEX","BLUE ORIGIN"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mycountry = (ListView) findViewById(R.id.country);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,countryList);
        mycountry.setAdapter(arrayAdapter);
        mycountry.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0)
        {
            Intent i = new Intent(this, India_Activity.class);
            startActivity(i);
        }
        if(position==1)
        {
            Toast.makeText(this,"ISRO",Toast.LENGTH_LONG).show();
        }
        if(position==2)
        {
            Toast.makeText(this,"Spacex",Toast.LENGTH_LONG).show();
        }
        if(position==2)
        {
            Toast.makeText(this,"Blue origin",Toast.LENGTH_LONG).show();
        }
    }
}