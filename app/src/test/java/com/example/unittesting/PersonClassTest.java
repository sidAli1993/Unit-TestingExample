package com.example.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;


public class PersonClassTest {

    @Test
    public void userNameEmpty() {
        PersonClass personClass=new PersonClass("dsdssdsd","Engineer",27,15000);
       boolean result= personClass.validation();
       if (result){
           assertTrue(result);
       }else {
           assertFalse(result);
       }

    }
    @Test
    public void nameLength() {
        PersonClass personClass=new PersonClass("Ali","Engineer",27,15000);
        boolean result= personClass.validation();
        assertFalse(result);
    }
    @Test
    public void ProfessionEmpty() {
        PersonClass personClass=new PersonClass("Mirza Ali","",27,15000);
        boolean result= personClass.validation();
        assertFalse(result);
    }

    @Test
    public void AgeLess() {
        PersonClass personClass=new PersonClass("Mirza Ali","Engineer",0,15000);
        boolean result= personClass.validation();
        assertFalse(result);
    }

    @Test
    public void AgeGreater() {
        PersonClass personClass=new PersonClass("Mirza Ali","Engineer",41,15000);
        boolean result= personClass.validation();
        assertFalse(result);
    }

    @Test
    public void SalaryLess() {
        PersonClass personClass=new PersonClass("Mirza Ali","Engineer",27,99999);
        boolean result= personClass.validation();
        assertFalse(result);
    }

    @Test
    public  void Salarygreater() {
        PersonClass personClass=new PersonClass("Mirza Ali","Engineer",27,100000);
        boolean result= personClass.validation();
        assertFalse(result);
    }

    @Test
    public  void AllGood() {
        PersonClass personClass=new PersonClass("Mirza Ali","Engineer",27,45000);
        boolean result= personClass.validation();
        assertTrue(result);
    }
}