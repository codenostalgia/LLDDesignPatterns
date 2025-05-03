package com.patterns.structural.proxypattern;

public class ProxyMain {

    public static void main(String[] args) {
        Employee employee = new EmployeeProxy();

        employee.create("USER");

        employee.delete("USER");
    }
}
