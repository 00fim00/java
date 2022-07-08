package com.PolyaIMetody;

public class Bus {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "G3245F";
    public final int SERIAL_NUMBER1 = 242565;

    public void go(){
        System.out.println("GO");
    }

    public void showKm(String km){
        System.out.println(km);

//        int km = 65;
//        String str = "70km";
    }

}
