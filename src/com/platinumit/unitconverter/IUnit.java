package com.platinumit.unitconverter;

public interface IUnit {

    String getSymbol();

    float convert(float value, String toSymbol);
}
