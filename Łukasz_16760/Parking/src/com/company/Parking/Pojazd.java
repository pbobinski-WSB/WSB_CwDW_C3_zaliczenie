package com.company.Parking;

import java.util.ArrayList;
import java.util.List;

public class Pojazd {
    List<String> marka = new ArrayList<String>();
    List<String> rejestracja = new ArrayList<String>();

//dodwananie bojazdu
    public static void dodajPojazd (String markaStr, String rejestracjaStr) {

        marka.add(markaStr);
        rejestracja.add(rejestracjaStr);
    }
    //wyswietl pojazdy
    public static void wyswietlPojazdy(){
        System.out.println(model[0]);
    }

}
class Samochod extends Pojazd {
    public static double cena(double cena) {
        cena = 2.50;
        return cena;
    }
}
class Motocykl extends Pojazd{
    public static double cena (double cena){
        cena = 1.50;
        return cena;
    }
}
class Tir extends Pojazd{
    public static double cena (double cena){
        cena = 5;
        return cena;
    }
}