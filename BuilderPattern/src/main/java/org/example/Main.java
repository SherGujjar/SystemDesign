package org.example;

public class Main {
    public static void main(String[] args) {
        StudentBuilder st = new StudentBuilder();
        Student student = st.setAge(12).setFathersName("testFather").setMotherName("testMother").setAge(20).setRollNo(21).setName("Sher").build();
        System.out.println(student.toString());
    }
}