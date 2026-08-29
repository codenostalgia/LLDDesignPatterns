package com.patterns.creational.prototype;

public class Student implements Prototype {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Student(this.name, this.age);
    }
}
