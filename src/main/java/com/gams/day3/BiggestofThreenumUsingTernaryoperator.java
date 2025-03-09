package com.gams.day3;

import java.util.Scanner;

public class BiggestofThreenumUsingTernaryoperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num 1");
        int num1=sc.nextInt();
        System.out.println("enter the num 2");
        int num2=sc.nextInt();
        System.out.println("enter the num3");
        int num3=sc.nextInt();
        int big = (num1>num2) ? (num1>num3 ? num1:num3): ((num2 > num3) ? num2 : num3);
        System.out.println("the biggest num is "+big+"");
    }
}
