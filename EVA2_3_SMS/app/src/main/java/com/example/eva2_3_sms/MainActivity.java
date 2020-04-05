package com.example.eva2_3_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Intent inSMS;
Button btnEnviar;
EditText edtTextNum, edtTxtMen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnviar = findViewById(R.id.btnEnviar);
        edtTxtMen = findViewById(R.id.edtTxtMen);
        edtTextNum = findViewById(R.id.edtTextNum);
        btnEnviar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String sTel = "smsto:" + edtTextNum.getText().toString();
                        String sMen = edtTxtMen.getText().toString();
                        inSMS = new Intent((Intent.ACTION))


                    }
                }
        );
    }
}
