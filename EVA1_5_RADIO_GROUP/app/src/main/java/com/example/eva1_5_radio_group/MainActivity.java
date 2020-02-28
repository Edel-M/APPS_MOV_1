package com.example.eva1_5_radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements RadioGroup.OnCheckedChangeListener{
RadioGroup rdComida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdComida = findViewById(R.id.rdComida);
        rdComida.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        //checkedId es el id del radiobutton seleccionado
        //findViewById regresa el View usando el id

        RadioButton rdBtnSel  = findViewById(checkedId);
        Toast.makeText(this, rdBtnSel.getText(), Toast.LENGTH_SHORT).show();

    }
}
