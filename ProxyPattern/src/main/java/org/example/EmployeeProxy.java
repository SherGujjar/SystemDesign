package org.example;

public class EmployeeProxy implements EmployeeDao{

    EmployeeDaoImpl emp;
    String role;
    EmployeeProxy(String role,EmployeeDaoImpl emp){
        this.emp = emp;
        this.role = role;
    }

    @Override
    public void create() {
        if(role.equalsIgnoreCase("ADMIN")){
            emp.create();
        }
        else{
            System.out.println("You Don;t have the access");
        }
    }

    @Override
    public void delete() {
        if(role.equalsIgnoreCase("ADMIN")){
            emp.create();
        }
        else{
            System.out.println("You Don;t have the access");
        }
    }

    @Override
    public void get() {
        if(role.equalsIgnoreCase("ADMIN") || role.equalsIgnoreCase("USER")){
            emp.get();
        }
    }
}
