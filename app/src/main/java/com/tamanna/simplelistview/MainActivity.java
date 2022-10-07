package com.tamanna.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView Declaration
        ListView listView= findViewById(R.id.simpleList);

        //Data Source
        ArrayList<String>list =new ArrayList<>();

        list.add("India");
        list.add("Africa");
        list.add("Australia");
        list.add("US");

        //Adapter
        arrayAdapter = new ArrayAdapter(this,R.layout.customlist,R.id.mylist,list);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String item = arrayAdapter.getItem(position).toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                        intent.putExtra("Display", item);
                startActivity(intent);
            }
        });

    }
}




