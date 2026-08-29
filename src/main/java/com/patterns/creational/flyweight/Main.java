package com.patterns.creational.flyweight;

public class Main {
    public static void main(String[] args) {
        Tree oak1 = TreeFactory.getTree("OAK");
        Tree oak2 = TreeFactory.getTree("OAK");

        oak1.display(1,2);
        oak2.display(12,22);
    }
}
