package com.example.unittesting;

public class PersonClass {
    private String name;
    private String profession;
    private int age;
    private double salary;

    public PersonClass(String name, String profession, int age, double salary) {
        this.name = name;
        this.profession = profession;
        this.age = age;
        this.salary = salary;
    }
    public boolean validation(){
        if (name.isEmpty()){
            return false;
        }
        if (name.length()<6){
            return false;
        }
        if (profession.isEmpty()){
            return false;
        }
        if (age<1){
            return false;
        }
        if (age>40){
            return false;
        }
        if (salary<10000){
            return false;
        }
        if (salary>50000){
            return false;
        }
        return true;
    }
}
