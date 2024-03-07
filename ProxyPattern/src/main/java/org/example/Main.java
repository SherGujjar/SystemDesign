package org.example;

public class Main {
    public static void main(String[] args) {


        EmployeeProxy emp = new EmployeeProxy("Admin",new EmployeeDaoImpl());
        emp.create();

    }
}