package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner skan = new Scanner(System.in);

//pobieramy od uzytkownika tablice l. rzeczywistych z zastosowaniem zabezpieczen przed podaniem nieprawidlowej
// wielkosci tablicy a takze blednych wartosci
    int n;//rozmiar tablicy
	    do{
            System.out.println("Podaj rozmiar tablicy: ");
            while (!skan.hasNextInt()){
                skan.next();
                System.out.println("Podaj liczbe nieujemna");
            }
            n = skan.nextInt();
        }while (n <= 0);
        System.out.println("Podany rozmiar: " + n);

        double [] tab = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Podaj liczbe rzeczywistą: ");
            while(!skan.hasNextDouble()){
                skan.next();
                System.out.println("Musisz podać liczbę rzeczywistą");
            }
            tab[i] = skan.nextDouble();
        }

        //3 sposoby wyswietlania elementow tablicy
        //sposob 1
        System.out.println("-----------------------");
        for(int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "]=" + tab[i]);
        }
        //sposob 2
        System.out.println("-----------------------");
        for(double t : tab)
            System.out.print(t + " ");
        System.out.println();

        //sposob 3
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(tab));


        System.out.println("PO POSORTOWANIU: ");
        Arrays.sort(tab);
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(tab));

        double sred = srednia(tab);
        System.out.println("Elementy mniejsze od sredniej (" + srednia(tab) + ")");
        for (double d : tab)
            if(d<sred)
                System.out.println(d);
    }

//wypisujemy na ekranie liczby, ktore sa mniejsze od sredniej arytmetycznej wszystkich liczb w tablicy
    public static double srednia(double [] t){
        double s = 0.0;
        for (double d : t)
            s +=d ;
        return s/t.length;
    }

}
