package com.example.eva2_8_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MyDataActivity extends AppCompatActivity implements ListView.OnItemClickListener, View.OnClickListener {
ListView lstVw;
Button button;
    String[] aDatos ={
            "Tacos Chihuas",
            "Cafeteria",
            "KFC",
            "Mc Donalds",
            "Burger King",
            "Little Caesars",
            "Doña pelos",
            "Domino´s"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_data);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        lstVw =findViewById(R.id.lstVw);
        lstVw.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, aDatos
        ));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent inDatos = new Intent();
        inDatos.putExtra("aaaa", aDatos[position]);
        setResult(Activity.RESULT_OK, inDatos);
        finish();
    }

    @Override
    public void onClick(View v) {
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}
