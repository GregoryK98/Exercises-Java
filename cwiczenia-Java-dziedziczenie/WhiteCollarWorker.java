package com.company;

public class WhiteCollarWorker extends Worker {
    private double perHour;
    private double numberH;

    public WhiteCollarWorker() {
    }

    public WhiteCollarWorker(String name, String surname, String PESEL, int yearOfBirth, int yearOfEmployment, char gender, String company, String occupation, double perHour, double numberH) {
        super(name, surname, PESEL, yearOfBirth, yearOfEmployment, gender, company, occupation);
        this.perHour = perHour;
        this.numberH = numberH;
    }

    public double payment(){
        return perHour*numberH;
    }

    public double getPerHour() {
        return perHour;
    }

    public void setPerHour(double perHour) {
        this.perHour = perHour;
    }

    public double getNumberH() {
        return numberH;
    }

    public void setNumberH(double numberH) {
        this.numberH = numberH;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Stawka godzinowa: " + perHour);
        System.out.println("Liczba przepracowanych godzin: " + numberH);

    }


    @Override
    public String toString() {
        return "WhiteCollarWorker{" +
                "perHour=" + perHour +
                ", numberH=" + numberH +
                "} " + super.toString();
    }
}
