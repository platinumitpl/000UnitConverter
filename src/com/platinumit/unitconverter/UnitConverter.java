package com.platinumit.unitconverter;

public class UnitConverter {

    static public double convert(double fromValue, String fromSymbol, String toSymbol) {

        double convertedValue = -1;

        if (!(fromValue > 0) || fromSymbol.isEmpty() || toSymbol.isEmpty()) {
            return -1;
        }

        if (fromSymbol.equals("kg") && toSymbol.equals("lb")) {
            double convertRate = 2.20462;
            convertedValue = fromValue * convertRate;
        }

        return convertedValue;
    }

}