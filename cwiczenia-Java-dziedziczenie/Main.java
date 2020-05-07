package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        WhiteCollarWorker wcw = new WhiteCollarWorker("Jan", "Kowalski", "12345678910", 1996, 2020, 'M', "ABC", "wykładowca", 50, 10);
        BlueCollarWorker bcw = new BlueCollarWorker("Adam", "Nowak", "12423446567", 1985, 2018, 'M', "XYZ", "asystent", 250);
        wcw.display();
        bcw.display();

        double [] t = CommissionWorker.generateSalaries(12);

        CommissionWorker cw = new CommissionWorker("Jan", "Kowalski", "12345678910", 1996, 2020, 'M', "ZXC", "wykładowca",t);
        cw.display();

//Scanner, czytanie z klawiatury
        Scanner skan = new Scanner(System.in);

        String imie;
        String nazwisko;
        String pesel;
        int rokUr;
        int rokZat;
        String plec;
        String miejscePracy;
        String zawod;
        double pensja;

        System.out.println("Podaj imie: ");
        imie = skan.next();//next bo pobieramy napis
        System.out.println("Podaj nazwisko: ");
        nazwisko = skan.next();
        System.out.println("Podaj PESEL: ");
        pesel = skan.next();
        System.out.println("Podaj rok urodzenia: ");
        rokUr = skan.nextInt();//wartosc ktora ma byc traktowana jako liczba calkowita
        System.out.println("Podaj rok zatrudnienia: ");
        rokZat = skan.nextInt();
        //zamiana z typu String na char
        System.out.println("Podaj plec: ");
        plec = skan.next();
        char plecCh = plec.charAt(0);
        System.out.println("Podaj miejsce pracy: ");
        miejscePracy = skan.next();
        System.out.println("Podaj zawod: ");
        zawod = skan.next();
        System.out.println("Podaj pensje: ");
        pensja = skan.nextDouble();

        BlueCollarWorker bcw = new BlueCollarWorker(imie, nazwisko, pesel, rokUr, rokZat, plecCh, miejscePracy, zawod, pensja);
        bcw.display();
    }
}
