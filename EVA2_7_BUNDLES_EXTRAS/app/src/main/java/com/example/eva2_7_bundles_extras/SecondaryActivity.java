package com.example.eva2_7_bundles_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {
TextView txtViewD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        setContentView(R.layout.activity_secondary)
        txtViewD = findViewById(R.id.edtText);
        Intent inDatos = getIntent();
        String cade =inDatos.getStringExtra("El gatillo");
        double dDato = inDatos.getDoubleExtra("DATILLOS", 0.0);

        txtViewD.setText(cade + ", "+ dDato);
txtViewD.append("\n");
txtViewD.append(bundle.getString);
    }
}
