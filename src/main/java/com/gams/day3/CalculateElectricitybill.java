package com.gams.day3;

import com.gams.Main;

import java.util.Scanner;

public class CalculateElectricitybill {
    public static void main(String[] args) {
        double baseprice = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of units");
        int units = sc.nextInt();
        double unitprice;
        if (units <= 100) {
            unitprice = 1;
        }else if (units > 100 && units <= 200) {
             unitprice = 2;
        }else if (units > 200 && units <= 300){
             unitprice = 3;
        }else{
          unitprice=4;
        }
        double bill=units*unitprice+baseprice;
        System.out.println(bill);
    }
}