package com.patterns.creational.builderpattern;

public class Pizza {

    // mandatory field
    String size;

    // optional fields
    boolean cheese;
    boolean pepperoni;
    boolean oregano;
    boolean mushroom;

    Pizza(PizzaBuilder builder){
        size = builder.size;
        cheese = builder.cheese;
        pepperoni = builder.pepperoni;
        oregano = builder.oregano;
        mushroom = builder.mushroom;
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

    public static class PizzaBuilder{

        // mandatory field
        String size;

        // optional fields
        boolean cheese;
        boolean pepperoni;
        boolean oregano;
        boolean mushroom;

        public PizzaBuilder(String size){
            this.size = size;
        }

        public PizzaBuilder addPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder addOregano(boolean oregano) {
            this.oregano = oregano;
            return this;
        }

        public PizzaBuilder addMushroom(boolean mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
