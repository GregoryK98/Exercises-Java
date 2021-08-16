package com.company;

public class KlientBanku {
    private String idKlienta;
    private String kodPin;
    private int stanKonta;

    public KlientBanku(String idKlienta, String kodPin, int stanKonta) {
        this.idKlienta = idKlienta;
        this.kodPin = kodPin;
        this.stanKonta = stanKonta;
    }

    public String getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(String idKlienta) {
        this.idKlienta = idKlienta;
    }

    public String getKodPin() {
        return kodPin;
    }

    public void setKodPin(String kodPin) {
        this.kodPin = kodPin;
    }

    public int getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(int stanKonta) {
        this.stanKonta = stanKonta;
    }

    public void wyswietl(){
        System.out.println("Twój stan konta to: " + stanKonta);
    }


    public boolean sprawdzeniePopPINu(String pin){
        if(kodPin.equals(pin)) {
            System.out.println("PIN poprawny");
            return true;
        }
        else
            System.out.println("PIN niepoprawny. Spróbuj ponownie");
            return false;
    }

    public int wplatomat(int kwotaWplaty){
        if(stanKonta == 0){
            System.out.println("Twoje konto nie posiada żadnych funduszy");
        }
        stanKonta = stanKonta + kwotaWplaty;
        System.out.println("Twój obecny stan konta to: " + stanKonta);
        return stanKonta;
    }

    public int bankomat(int kwotaWyplaty){
        if(kwotaWyplaty>stanKonta)
            System.out.println("Twoje konto posiada za mało funduszy aby wypłacić Twoją kwotę");
        stanKonta = stanKonta - kwotaWyplaty;
        System.out.println("Twój obecny stan konta to: " + stanKonta);
        return stanKonta;
    }

    @Override
    public String toString() {
        return "KlientBanku{" +
                "idKlienta='" + idKlienta + '\'' +
                ", kodPin='" + kodPin + '\'' +
                ", stanKonta=" + stanKonta +
                '}';
    }
}