package com.company;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    static int cenaCalosc;
    static List<String> produkty = new ArrayList<String>();
    //dodawanie produktu
    static void dodajProd(int i){
        ProduktArray dodawanieProd = new ProduktArray();
        cenaCalosc = cenaCalosc + dodawanieProd.oddajProdCena(i);
        produkty.add(dodawanieProd.oddajProdNazw(i));

    }
    //odejmowanie produktu (nie dziala)
    static void odejmijProd(int i){
        boolean zawiera =produkty.contains(i);
        if (zawiera)
        {
            System.out.println("Usuwam produkt nr: " + i);
            produkty.remove(i);
        }
        else{ System.out.println("pod adresem nie ma zadnego produktu"); }
    }

    //ukazywanie produktow w koszyku i sumy cen produktow
    static String pokazKoszyk(){
        return "w koszyku posiadasz: "+ produkty + " i suma ceny to: " + cenaCalosc;
    }
}
