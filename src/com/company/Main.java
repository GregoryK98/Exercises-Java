package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<KlientBanku> klient = new ArrayList<KlientBanku>();
        klient.add(new KlientBanku("0", "1234", 15000));
        klient.add(new KlientBanku("1", "0105", 20000));
        klient.add(new KlientBanku("2", "6431", 50000));
        Scanner skan = new Scanner(System.in);

        String pinCode;
        int saldo;
        int czynnosc;
        int kWplaty;
        int kWyplaty;
        String nrKlienta;

        System.out.println("Podaj swój nr klienta:");
        nrKlienta = skan.next();
        klient.get(Integer.parseInt(nrKlienta));
        System.out.println("Podaj swój kod PIN:");
        pinCode = skan.next();

        while (klient.get(Integer.parseInt(nrKlienta)).sprawdzeniePopPINu(pinCode)==false) {
            System.out.println("Podaj swój poprawny kod PIN:");
            pinCode = skan.next();
        }

            System.out.println("Witamy w bankomacie. Poniżej akcje dostępne w naszym bankomacie:");
            System.out.println("Wybierz 1, aby wpłacić pieniądze");
            System.out.println("Wybierz 2, aby wypłacić pieniądze");
            System.out.println("Wybierz 3, aby sprawdzić stan konta");
            System.out.println("Pamiętaj, aby zabrać kartę po transakcji!!!");
            System.out.println("Wybierz:");
            czynnosc = skan.nextInt();
            switch (czynnosc) {
                case 1:
                    System.out.println("Wpisz kwotę, którą chcesz wpłacić: ");
                    kWplaty = skan.nextInt();
                    klient.get(Integer.parseInt(nrKlienta)).wplatomat(kWplaty);
                    break;
                case 2:
                    System.out.println("Wpisz kwotę, którą chcesz wypłacić");
                    kWyplaty = skan.nextInt();
                    klient.get(Integer.parseInt(nrKlienta)).bankomat(kWyplaty);
                    break;
                case 3:
                    System.out.println("Możesz tu sprawdzić swój stan konta");
                    klient.get(Integer.parseInt(nrKlienta)).wyswietl();
                    break;
        }
    }
}