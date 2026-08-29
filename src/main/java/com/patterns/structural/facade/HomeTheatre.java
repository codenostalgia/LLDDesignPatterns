package com.patterns.structural.facade;

public class HomeTheatre {

    private Projector projector;
    private Speaker speaker;
    private DVD dvd;

    public HomeTheatre(Projector projector, Speaker speaker, DVD dvd) {
        this.projector = projector;
        this.speaker = speaker;
        this.dvd = dvd;
    }

    public void watchMovie(String movieName) {
        projector.on();
        speaker.on();
        dvd.on();
        System.out.println("Movie started..!");
    }

    public void endMovie(String movieName) {
        projector.off();
        speaker.off();
        dvd.off();
        System.out.println("Movie stopped..!");
    }
}
