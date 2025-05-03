package com.patterns.structural.proxypattern;

public class EmployeeProxy implements Employee {

    Employee employee;

    public EmployeeProxy() {
        employee = new EmployeeImpl();
    }

    @Override
    public void create(String who) {

        if (who.equalsIgnoreCase("ADMIN") | who.equalsIgnoreCase("USER")) {
            employee.create(who);
            return;
        }

        throw new RuntimeException("Invalid user");

    }

    @Override
    public void delete(String who) {
        if (who.equalsIgnoreCase("ADMIN")) {
            employee.delete(who);
            return;
        }

        throw new RuntimeException("Only Admin can delete");
    }
}
