package com.example.unittesting;

public class DummyClass {

    public float convertFTOC(float F){
        return ((F-32) * 5/9);
    }
    public float convertCTOF(float C){
        return ((C *9)/5)+32;
    }
    public int addTwoNumbers(int a,int b){
        return a+b;
    }
}
