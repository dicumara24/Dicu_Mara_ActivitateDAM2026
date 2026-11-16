package com.example.laboratorobiecte;

import java.io.Serializable;

public class Drona implements Serializable {
    private String model;
    private int autonomie;
    private boolean cuCamera;
    private String culoare;
    private float rating;
    private boolean estePornita;

    public Drona(String model, int autonomie, boolean cuCamera, String culoare, float rating, boolean estePornita) {
        this.model = model;
        this.autonomie = autonomie;
        this.cuCamera = cuCamera;
        this.culoare = culoare;
        this.rating = rating;
        this.estePornita = estePornita;
    }

    @Override
    public String toString() {
        return "Drona: " + model +
                "\nAutonomie: " + autonomie + " min" +
                "\nCu camera: " + cuCamera +
                "\nCuloare: " + culoare +
                "\nRating: " + rating + " stele" +
                "\nPornita: " + estePornita;
    }
}
