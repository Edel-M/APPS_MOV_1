package com.example.eva2_7_bundles_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btnLanzar;
EditText edtText;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLanzar = findViewById(R.id.btnLanzar);
        edtText = findViewById(R.id.edtText);
        btnLanzar.setOnClickListener(this);

    }
    public void onClick(View v){
        String cade = edtText.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("EL_BUNDLE",cade);
        bundle.putInt("EL_ENTERO", 10);

        intent = new Intent(this, SecondaryActivity.class);
        intent.putExtra("El gatillo",cade);
        intent.putExtra
        intent.putExtras(bundle);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
