package com.example.eva1_11_clima;

public class Weather {

    //Nombre de la ciudad    String
    //temperatura   int
    //descripcion del clima   String
    //imagen que conrresponde con ese clima   int

    private String city;
    private int temp;
    private String desc;
    private int image;

    public Weather(String city, int temp, String desc, int image) {
        this.city = city;
        this.temp = temp;
        this.desc = desc;
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public int getTemp() {
        return temp;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}
