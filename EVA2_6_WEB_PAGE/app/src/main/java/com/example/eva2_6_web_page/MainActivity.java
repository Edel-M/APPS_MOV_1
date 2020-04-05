package com.example.eva2_6_web_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtValidUrl;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtValidUrl = findViewById(R.id.txtUrl);
        btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String validUrl = "http://www." + txtValidUrl.getText().toString();
        Intent intentWebPage = new Intent(Intent.ACTION_VIEW, Uri.parse(validUrl));
        startActivity(intentWebPage);
    }
}
