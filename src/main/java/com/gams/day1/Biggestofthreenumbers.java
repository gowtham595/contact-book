package com.gams.day1;

import com.gams.Main;

public class Biggestofthreenumbers {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 4;
        int num3 = 5;
        int big = Math.max(num1,Math.max(num2,num3));
        System.out.println("The biggest number of "+num1+","+num2+","+num3+"is" +big);
    }
}
