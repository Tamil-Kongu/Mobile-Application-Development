package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void radiobuttonclicked(View v)
    {
        RadioGroup space = (RadioGroup) findViewById(R.id.spacestation);
        int id = space.getCheckedRadioButtonId();
        switch(id)
        {
            case R.id.Space1:
                Toast.makeText(this,"SpaceX selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Space2:
                Toast.makeText(this,"ISRO selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Space3:
                Toast.makeText(this,"NASA selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Space4:
                Toast.makeText(this,"Blue origin selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Space5:
                Toast.makeText(this,"RosKosMos selected",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}