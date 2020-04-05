package com.example.eva2_8_activity_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnSelRes, btnCont, btnImg, btnAudio, btnVideo;
Intent inSelRest, inSelCont, intSelImg, intSelAud, intSelVid;
final int CONTACTOS = 2000;
final int IMAGENES = 3000;
final int RESTAURANTE = 1000;
final int AUDIO = 4000;
final int VIDEO = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSelRes = findViewById(R.id.btnSelRes);
        btnCont = findViewById(R.id.btnCont);
        btnImg = findViewById(R.id.btnImg);
        btnAudio = findViewById(R.id.btnVideo);
        btnVideo = findViewById(R.id.btnVideo);

inSelRest = new Intent(this, MyDataActivity.class);
inSelCont = new Intent(Intent.ACTION_PICK, android.provider.ContactsContract.Contacts.CONTENT_URI);
intSelAud = new Intent(Intent.ACTION_PICK,)
intSelImg =new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
btnSelRes.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        startActivityForResult(inSelRest,RESTAURANTE);
    }
});
        btnImg.OnClickListener(new View
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case RESTAURANTE: //que actividad devolvio kos datos
                if(resultCode == Activity.RESULT_OK){ //cual fue la respuesta

                    //Que accion con los datos devueltos
                    data.getStringExtra("aaaa");
                    Toast.makeText(this, "aaaa", Toast.LENGTH_SHORT).show();

                }else
                    Toast.makeText(this, "Cancelado por el usuario", Toast.LENGTH_SHORT).show();
                break;
            case CONTACTOS:
                if(resultCode == Activity.RESULT_OK) { //cual fue la respuesta
                    String sCont = data.getDataString();
                    Log.wtf("CONTACTO", sCont);
                    Toast.makeText(this, sCont, Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
