package com.example.admin.cricketer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;

public class Cricket extends AppCompatActivity {

    ArrayList<CricketModel> cricketers;
    ListView listView;
    private static CricketerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      //  listView = (ListView)findViewById(R.id.name);

        cricketers = new ArrayList<>();
        cricketers.add(new CricketModel("virat","bangalore",100,8000,123.9));
        cricketers.add(new CricketModel("ROHIT","mumbai",80,7000,110.3));
        cricketers.add(new CricketModel("dhoni","pune",120,9000,100.4));
        cricketers.add(new CricketModel("raina","gujarat",70,5000,98.7));



    }
}
