//cwiczenie na dziedziczenie, w Mainie Scanner
package com.company;

public class BlueCollarWorker extends Worker {
    private double salary;

    public BlueCollarWorker() {
    }

    public BlueCollarWorker(String name, String surname, String PESEL, int yearOfBirth, int yearOfEmployment, char gender, String company, String occupation, double salary) {
        super(name, surname, PESEL, yearOfBirth, yearOfEmployment, gender, company, occupation);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "BlueCollarWorker{" +
                "salary=" + salary +
                "} " + super.toString();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Pensja: " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
