package com.gams.day3;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {


        System.out.println("enter the bill amount:");
        double billamount = 9000;
        double discount = 0;
        if (billamount>5000){
            discount = billamount * 0.20 ;
        }
        double netamount = billamount - discount ;
        System.out.println(""+billamount+","+discount+","+netamount+"");

    }
}
