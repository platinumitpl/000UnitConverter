package com.platinumit.unitconverter;

public class UnitConverter {

    public double convert(float fromValue, String fromSymbol, String toSymbol) {

        double convertedValue = 0;

        if (!(fromValue > 0) || fromSymbol.isEmpty() || toSymbol.isEmpty()) {
            return 0;
        }

        if (fromSymbol.equals("kg") && toSymbol.equals("lb")) {
            double convertRate = 2.20462;
            convertedValue = fromValue * convertRate;
        }

        return convertedValue;
    }

}