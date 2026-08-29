package com.patterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Student s = new Student("Harry", 22);

        // cloning using Prototype pattern
        Student clone = (Student) s.clone();
    }
}
