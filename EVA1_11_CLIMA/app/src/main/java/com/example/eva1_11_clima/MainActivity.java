package com.example.eva1_11_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView lstVwClima;
Weather[] cities ={
        new Weather("Chihuahua",20, "Nublado", R.drawable.light_rain),
        new Weather("Delicias",-5, "Despejado", R.drawable.sunny),
        new Weather("Ciudad Juárez",-3, "Nevadas intensas", R.drawable.snow),
        new Weather("Jiménez",23, "Lluvias intensas", R.drawable.rainy),
        new Weather("Camargo",32, "Vientos intensos", R.drawable.thunderstorm),
        new Weather("Satevó",25, "Vientos demasiado fuertes", R.drawable.tornado),
        new Weather("Creel",18, "Niebla", R.drawable.cloudy)
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwClima = findViewById(R.id.lsVwClima);
lstVwClima.setAdapter(new WeatherAdapter(this, R.layout.mi_layout, cities));
    }
}
