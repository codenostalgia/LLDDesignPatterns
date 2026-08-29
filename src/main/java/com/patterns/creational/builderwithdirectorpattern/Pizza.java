package com.patterns.creational.builderwithdirectorpattern;

public class Pizza {

    // mandatory field
    String size;

    // optional fields
    boolean cheese;
    boolean pepperoni;
    boolean oregano;
    boolean mushroom;

    public void setSize(String size) {
        this.size = size;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setOregano(boolean oregano) {
        this.oregano = oregano;
    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", oregano=" + oregano +
                ", mushroom=" + mushroom +
                '}';
    }


}
