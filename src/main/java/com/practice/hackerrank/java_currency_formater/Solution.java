package com.practice.hackerrank.java_currency_formater;

import java.text.*;
import java.util.*;


public class Solution {

    public static void main(String[] args)  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        boolean constraint = payment >= 0 && payment <= Math.pow(10,9);

        Locale localeIndia = new Locale("en","IN");
        NumberFormat indianFormat = NumberFormat.getCurrencyInstance(localeIndia);

        DecimalFormat rs = (DecimalFormat) indianFormat;
        DecimalFormatSymbols rs_symbol = rs.getDecimalFormatSymbols();

        rs_symbol.setCurrencySymbol("Rs.");
        rs.setDecimalFormatSymbols(rs_symbol);

        Locale[] locales = {Locale.US,localeIndia, Locale.CHINA, Locale.FRANCE};

        if(constraint){
            for (Locale locale : locales) {
                if(locale.equals(localeIndia)){
                    System.out.println("India: " + rs.format(payment));
                }
                if(locale.equals(Locale.US)){
                    System.out.println("US: " + NumberFormat.getCurrencyInstance(locale).format(payment));
                }
                if(locale.equals(Locale.CHINA)){
                    System.out.println("China: " + NumberFormat.getCurrencyInstance(locale).format(payment));
                }
                if(locale.equals(Locale.FRANCE)){
                    System.out.println("France: " + NumberFormat.getCurrencyInstance(locale).format(payment));
                }
            }
        }
    }
}
