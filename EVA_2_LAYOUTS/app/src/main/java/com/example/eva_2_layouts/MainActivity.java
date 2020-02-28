package com.example.eva_2_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtTxtNom, edtTxtApe, edtTxtEdad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Conectar Componentes:
        edtTxtApe = findViewById(R.id.edtTxtApe);
        edtTxtNom = findViewById(R.id.edtTxtNom);
        edtTxtEdad = findViewById(R.id.edtTxtEdad);
    }


}
