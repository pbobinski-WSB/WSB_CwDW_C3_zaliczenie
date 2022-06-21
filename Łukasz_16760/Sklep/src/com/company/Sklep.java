package com.company;


public class Sklep {
    static void listaProduktow(){
        ProduktArray produkty = new ProduktArray();
        for(int i=0;i<=2;i++){
        System.out.println(produkty.wypiszProd(i));
        }
    }
    static void kolejkaKlientow(){
        Klient klienci = new Klient();
        for(int i=0;i<=2;i++){
            System.out.println(klienci.klientela(i));
        }
    }
}
