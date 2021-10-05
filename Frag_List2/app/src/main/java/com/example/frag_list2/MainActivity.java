package com.example.frag_list2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String Slist[] = {"SPACEX","NASA","ISRO","BLUE ORIGIN"};
        ListView lv = (ListView) findViewById(R.id.splist);
        ArrayAdapter<String> listadapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Slist);
        lv.setAdapter(listadapter);
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        FragmentTransaction ftransaction;
        if(position == 0)
        {
            ftransaction = getSupportFragmentManager().beginTransaction();
            spacex spx = new spacex();
            ftransaction.replace(R.id.fragmentContainerView4,spx);
            ftransaction.commit();

        }
        if(position == 2)
        {
            ftransaction = getSupportFragmentManager().beginTransaction();
            isro is = new isro();
            ftransaction.replace(R.id.fragmentContainerView4,is);
            ftransaction.commit();

        }
    }
}