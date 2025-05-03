package com.patterns.structural.proxypattern;

public class EmployeeImpl implements Employee {
    @Override
    public void create(String who) {
        System.out.println("created employee");
    }

    @Override
    public void delete(String who) {
        System.out.println("deleted employee");
    }
}
