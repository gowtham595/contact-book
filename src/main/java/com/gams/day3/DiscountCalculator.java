package com.gams.day3;

public class DiscountCalculator {
    public static void main(String[] args) {

        System.out.println("billamount");
        double billamount = 15000;

        double discount =0;
        if (billamount>5000) {
            discount = billamount * 0.2;
        }
            double netamount = billamount - discount ;
            System.out.println(""+netamount+","+billamount+ ","+discount+"");


    }
}

