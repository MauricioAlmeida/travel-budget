package com.mauricioalmeida.travelbudget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TravelsActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travels);

        ArrayAdapter<CharSequence> itemsAdapter = ArrayAdapter.createFromResource(this, R.array.my_travels, android.R.layout.simple_list_item_1);

        listView = (ListView) findViewById(R.id.travel_list);
        listView.setAdapter(itemsAdapter);
    }
}
