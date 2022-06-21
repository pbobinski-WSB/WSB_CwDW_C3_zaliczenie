package com.company;



public class Main {

    //test tego czy wypisanie wybranego produktu zadziala
    public static void main(String[] args) {
    ProduktArray produkty = new ProduktArray();
    System.out.println(produkty.wypiszProd(0));

    //test tego czy dodanie do koszyka zadziala )
    Koszyk dodajIPokaz = new Koszyk();
    dodajIPokaz.dodajProd(0);
    //Wypisanie zawartosci koszyka
    System.out.println(dodajIPokaz.pokazKoszyk());

    //test usuwania produktow i sprawdzanie koszyka ponownie (niestety nie dziala)
    dodajIPokaz.odejmijProd(0);

    System.out.println(dodajIPokaz.pokazKoszyk());

    //test klasy Sklep
    Sklep sklepik = new Sklep();
    sklepik.listaProduktow();
    sklepik.kolejkaKlientow();



    }
}

