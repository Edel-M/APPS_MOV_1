package com.example.eva2_5_contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSearch = findViewById(R.id.btnShowContacts);

        btnSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String contactStatement = "content://contacts/people/";
        Intent intentViewContact = new Intent(Intent.ACTION_VIEW, Uri.parse(contactStatement));
        startActivity(intentViewContact);
    }
}
