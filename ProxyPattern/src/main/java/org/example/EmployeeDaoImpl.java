package org.example;

public class EmployeeDaoImpl implements EmployeeDao{



    EmployeeDaoImpl(){

    }

    @Override
    public void create() {
        System.out.println("User created ");
    }

    @Override
    public void delete() {
        System.out.println("Uer deleted ");
    }

    @Override
    public void get() {
        System.out.println("Hello user ");
    }
}
