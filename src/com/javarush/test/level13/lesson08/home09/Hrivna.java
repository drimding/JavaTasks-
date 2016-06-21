package com.javarush.test.level13.lesson08.home09;

/**
 * Created by drimcatcher on 07.04.2016.
 */
public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}
