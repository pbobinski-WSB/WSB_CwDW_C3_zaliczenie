package com.company;


import java.util.ArrayList;
import java.util.List;

public class Produkt {
    List<String> nazwa = new ArrayList<String>();
    List<Integer> cena = new ArrayList<Integer>();


    public String wypiszListaProd(int i){
        return "produkt: "+nazwa.get(i) +" kosztuje: "+ cena.get(i);
    }
}
