package com.patterns.structural.facade;

// This pattern exposes only one entry point to client and hides subsystem complexity
public class CLient {
    public static void main(String[] args) {
        Projector projector = new Projector();
        Speaker speaker = new Speaker();
        DVD dvd = new DVD();

        HomeTheatre homeTheatre = new HomeTheatre(projector, speaker, dvd);

        homeTheatre.watchMovie("Inception");
        homeTheatre.endMovie("Inception");
    }
}
