package com.gams.day3;


import java.util.Scanner;

public class Biggestofthreenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1 ");
        int num1 = sc.nextInt();
        System.out.println("enter the num 2");
        int num2 = sc.nextInt();
        System.out.println("enter the num 3");
        int num3 = sc.nextInt();

        if(num3 >num1 && num3>num2 ){
            System.out.println(num3);
        } else if(num2 > num3 && num2>num1 ) {
            System.out.println(num2);
        }
        else
            System.out.println(num1);

        }
    }


