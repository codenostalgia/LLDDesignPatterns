package com.patterns.creational.flyweight;

public class Oak implements Tree {

    String name;

    public Oak(String name) {
        this.name = name;
    }
    // cordinates where the tree is in game
    // int x;
    // int y;

    @Override
    public void display(int x, int y) {
        System.out.println(name + " Tree at: " + x + ", " + y);
    }
}
