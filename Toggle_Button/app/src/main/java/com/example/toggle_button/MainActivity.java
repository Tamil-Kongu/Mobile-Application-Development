package com.example.toggle_button;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

@SuppressLint("UseSwitchCompatOrMaterialCode")
public class MainActivity extends AppCompatActivity {
    TextView state;
    TextView p, sub;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        state = findViewById(R.id.mytext);
        p = findViewById(R.id.power);
        sub = findViewById(R.id.Course);
    }
    public void ToggleClicked(View v)
    {
        boolean on = ((ToggleButton)v).isChecked();
        if(on) {
            state.setText("ON");
        }
        else {
            state.setText("OFF");
        }
    }

    public void switchstate(View v)
    {
        boolean on = ((Switch)v).isChecked();
        if(on) {
            p.setText("POWER ON");
        }
        else {
            p.setText(" POWER OFF");
        }
    }

    public void subject(View v)
    {
        boolean select = ((CheckBox)v).isChecked();
        StringBuffer result = new StringBuffer();
        switch(v.getId()){
            case R.id.EEE:
                if(select)
                {
                    sub.setText("EEE subject");
                    result.append("EEE - POWER SYSTEMS");
                }
                break;
            case R.id.CIVIL:
                if(select)
                {
                    sub.setText("CIVIL subject");
                    result.append("CIVIL - STRUCTURAL DESIGN");
                }
                break;
            case R.id.CSE:
                if(select)
                {
                    sub.setText("CSE subject");
                    result.append("CSE - REACT NATIVE");
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
        Toast.makeText(this,result,Toast.LENGTH_LONG).show();
    }
}