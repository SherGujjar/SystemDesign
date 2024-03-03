package org.example;

public class Student {

    public int age;
    public int rollNo;
    public String name;
    public String fatherName;
    public String motherName;

    public Student(StudentBuilder sb){
        this.age = sb.age;
        this.fatherName = sb.fatherName;
        this.motherName = sb.motherName;
        this.rollNo = sb.rollNo;
        this.name = sb.name;
    }

    public String toString(){
        return "Student : { name = "+this.name+" rollno = "+this.rollNo+" age = "+this.age+" fatherName = "+this.fatherName+" motherName = "+this.motherName+" }";
    }

}
