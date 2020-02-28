package com.example.eva1_7_orientacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnMenssaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMenssaje = findViewById(R.id.btnMenssaje);
        btnMenssaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "HOLA MUNDO", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
