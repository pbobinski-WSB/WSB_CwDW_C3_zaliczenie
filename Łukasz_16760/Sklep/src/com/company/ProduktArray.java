package com.company;

public class ProduktArray {
    // lista z nazwami produktow i ich cena
    String[] nazwa = {"Maslo","Woda","Mleko"};
    Integer[] cena = {5,2,3};
    public String wypiszProd(int i){
        return "Produkt: " + nazwa[i] + " kosztuje: "+ cena[i]+"zl";
    }
    //oddawanie nazwy i ceny produktow
    public String oddajProdNazw(int i){
        return nazwa[i];
    }
    public int oddajProdCena(int i){
        return cena[i];
    }
}
