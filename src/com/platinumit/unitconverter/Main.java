package com.platinumit.unitconverter;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world");

        String toSymbol = "lb";
        String fromSymbol = "kg";
        double fromValue = 123;

        double convertedValue = UnitConverter.convert(fromValue, fromSymbol, toSymbol);

        System.out.println(convertedValue);
    }
}
