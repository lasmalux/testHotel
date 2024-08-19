package org.example.models;

import java.time.LocalDate;

public class Reservation {
    private LocalDate dateReservation;
    private String nomClient;
    private int numeroChambre;
    private int nombreJourReserve;

    public Reservation(LocalDate dateReservation, String nomClient, int numeroChambre, int nombreJourReserve) {
        this.dateReservation = dateReservation;
        this.nomClient = nomClient;
        this.numeroChambre = numeroChambre;
        this.nombreJourReserve = nombreJourReserve;
    }


    public LocalDate getDateReservation() {
        return dateReservation;
    }
    public String getNomClient() {
        return nomClient;
    }
    public int getNumeroChambre() {
        return numeroChambre;
    }
    public int getNombreJourReserve() {
        return nombreJourReserve;
    }


    public void setNombreJourReserve(int nombreJourReserve) {
        this.nombreJourReserve = nombreJourReserve;
    }
    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }


    @Override
    public String toString() {
        int annee = dateReservation.getYear();
        int mois = dateReservation.getMonthValue();
        int jour = dateReservation.getDayOfMonth();
        return String.format("%s reserve la chambre %s à partir du %s-%s-%s pour %s jour", nomClient, numeroChambre, jour,mois,annee, nombreJourReserve);
    }
}
