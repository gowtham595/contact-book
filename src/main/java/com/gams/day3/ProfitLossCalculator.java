package com.gams.day3;

import java.util.Scanner;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the costprice");
        double costprice = sc.nextDouble();
        System.out.println("enter the selling price");
        double sellingprice = sc.nextDouble();
         if (sellingprice>costprice){
             System.out.println("profit");
             double profitamount =sellingprice-costprice;
             System.out.println("enter the profit amount"+profitamount+"");
         }else {
             System.out.println("loss");
             double lossamount = costprice - sellingprice;
             System.out.println("enter the loss amount"+lossamount+"");
         }
    }
}
