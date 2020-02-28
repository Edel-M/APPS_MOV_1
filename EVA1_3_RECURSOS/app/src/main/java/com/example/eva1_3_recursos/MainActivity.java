package com.example.eva1_3_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgViewFoto;
    TextView txtViewTit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgViewFoto = findViewById(R.id.imgViewFoto);
        txtViewTit.setText("" + 1);
        imgViewFoto.setImageResource(R.drawable.grand);

    }
}
