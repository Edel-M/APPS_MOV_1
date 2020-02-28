package com.example.eva1_11_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter<Weather> {

    Weather[] objects;
    Context context;
    int resource;

    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.objects = objects;
        this.context = context;
        this.resource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       if(convertView == null){//PRIMERA VEZ, HAY QUE CREAR EL LAYOUT
            convertView = ((Activity)context).getLayoutInflater().inflate(resource, parent, false);
       }
       //HAY QUE RECUPERAR LOS COMPONENTES
        ImageView imgDesc;
        TextView txtCity, txtTemp, txtDesc;
        imgDesc = convertView.findViewById(R.id.imgDesc);
        txtCity = convertView.findViewById(R.id.txtCity);
        txtTemp = convertView.findViewById(R.id.txtTemp);
        txtDesc = convertView.findViewById(R.id.txtDesc);
        imgDesc.setImageResource(objects[position].getImage());
        txtCity.setText(objects[position].getCity());
        txtTemp.setText("" + objects[position].getTemp());
        txtDesc.setText(objects[position].getDesc());


        return convertView;
    }
}
