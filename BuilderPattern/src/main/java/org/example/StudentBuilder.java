package org.example;

public class StudentBuilder {
    public int age;
    public int rollNo;
    public String name;
    public String fatherName;
    public String motherName;

    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public StudentBuilder setRollNo(int rollNo){
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder setFathersName(String fatherName){
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName){
        this.motherName = motherName;
        return this;
    }

    public Student build(){
        return new Student(this);
    }

}
