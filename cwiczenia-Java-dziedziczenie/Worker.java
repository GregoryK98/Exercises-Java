package com.company;

import java.util.Calendar;
//klasa bazowa Worker, po której dziedzicza: klasa BlueCollarWorker, WhiteCollarWorker i CommisionWorker
public class Worker {
    private String name;
    private String surname;
    private String PESEL;
    private int yearOfBirth;
    private int yearOfEmployment;
    private char gender;
    private String company;
    private String occupation;

    public Worker() {
    }

    public Worker(String name, String surname, String PESEL, int yearOfBirth, int yearOfEmployment, char gender, String company, String occupation) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
        this.yearOfBirth = yearOfBirth;
        this.yearOfEmployment = yearOfEmployment;
        this.gender = gender;
        this.company = company;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", yearOfEmployment=" + yearOfEmployment +
                ", gender=" + gender +
                ", company='" + company + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
    }

//metoda, ktora oblicza staz pracy, biorac aktualny rok i rok zatrudnienia
    public int jobSeniority(){
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfEmployment;
    }

//metoda, która oblicza ile lat zostalo do emerytury, zaleznie od plci
    public int toRetirement(){
        if(gender == 'M' && getAge() < 65)
            return 65 - getAge();
        else if(getAge() < 60)
            return 60 - getAge();
        return 0;
    }

    public void display(){
        System.out.println("Imie i nazwisko: " + name + " " + surname);
        System.out.println("Numer PESEL: " + PESEL);
        System.out.println("Rok urodzenia: " + yearOfBirth);
        System.out.println("Rok zatrudnienia: " + yearOfEmployment);
        System.out.println("Wiek: " + getAge());
        System.out.println("Staż pracy: " + jobSeniority());
        if(gender == 'M')
            System.out.println("Płeć: Mężczyzna");
        else
            System.out.println("Płeć: Kobieta");
        System.out.println("Miejsce pracy: " + company);
        System.out.println("Zawód: " + occupation);
    }
}
