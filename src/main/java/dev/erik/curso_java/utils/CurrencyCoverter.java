package dev.erik.curso_java.utils;

public class CurrencyCoverter {

    public static final double iof = 1.06;
    
        public static double coverter(double value, double dollarPrice){
            return value * dollarPrice * iof;
        }
}
