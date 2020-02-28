package com.example.eva1_9_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String sMostrar = "The unqomdosmldnfsdkj";
TextView txtVwMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
txtVwMensaje = findViewById(R.id.txtVwMensaje);
txtVwMensaje.setText(sMostrar);

    }
}
