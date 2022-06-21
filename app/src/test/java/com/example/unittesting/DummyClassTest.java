package com.example.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DummyClassTest {

    @Test
    void convertFTOC() {
        float input = 212;
        float output;
        float expected = 100;
        double delta = .1;

        DummyClass dummyClass = new DummyClass();
        output = dummyClass.convertFTOC(input);
        assertEquals(expected, output, delta);
    }

    @Test
    void convertCTOF() {
        float input=100;
        float output;
        float expected=212;
        double delta=.1;

        DummyClass dummyClass=new DummyClass();
        output=dummyClass.convertCTOF(input);
        assertEquals(expected,output,delta);
    }
    @Test
    void addNumbers(){
        int a=5;
        int b=5;
        int output;
        int expected=8;
        int difference=2;
        DummyClass dummyClass=new DummyClass();
        output=dummyClass.addTwoNumbers(a,b);
        assertEquals(expected,output,difference);
    }
}