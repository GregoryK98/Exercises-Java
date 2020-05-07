package com.company;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class CommissionWorker extends Worker {
    private double [] monthlySalaries;

    public CommissionWorker() {
    }

    public CommissionWorker(String name, String surname, String PESEL, int yearOfBirth, int yearOfEmployment, char gender, String company, String occupation, double[] monthlySalaries) {
        super(name, surname, PESEL, yearOfBirth, yearOfEmployment, gender, company, occupation);
        this.monthlySalaries = monthlySalaries;
    }

    public double[] getMonthlySalaries() {
        return monthlySalaries;
    }

    public void setMonthlySalaries(double[] monthlySalaries) {
        this.monthlySalaries = monthlySalaries;
    }

    @Override
    public String toString() {
        return "CommissionWorker{" +
                "monthlySalaries=" + Arrays.toString(monthlySalaries) +
                "} " + super.toString();
    }
//metoda, ktora zwraca sume wszystkich kwot przechowywanych w tablicy
    public double totalIncome(){
        double s = 0;
        for(double sal : monthlySalaries)
            s += sal;
        return s;
    }

//metoda, ktora zwraca srednia miesieczna pensje pracownika
    public double averageSalary(){
        return totalIncome()/monthlySalaries.length;
    }

//metoda, ktora zwraca ile pensji jest wyzszych od liczby rzeczywistej przekazanej jako parametr
    public int calculateBiggerSalaries(double k){
        int counter = 0;
        for(double sal : monthlySalaries)
            if(sal > k)
                counter++;
        return counter;
    }

    @Override
    public void display() {
        DecimalFormat df = new DecimalFormat("0.00");
        super.display();
        System.out.println("Srednia pensja: " + averageSalary());
        System.out.println("Suma pensji: " + totalIncome());
        System.out.println("Pensje w kolejnych miesiącach: ");
        for(double sal : monthlySalaries)
            System.out.print(df.format(sal) + " ");
        System.out.println();
    }
/*
metoda, która zwraca tablicę rozmiaru n, gdzie n jest jedynym parametrem funkcji, wypełnioną losowo wygenerowanymi
 liczbami rzeczywistymi oznaczającymi pensje pracownika pracującego na zlecenie
    */
    public static double [] generateSalaries(int n){
        double [] tab = new double[n];
        Random rand = new Random();
        for(int i = 0; i < n; i++)
            tab[i] = rand.nextDouble() * 10000;
        return tab;
    }

}
