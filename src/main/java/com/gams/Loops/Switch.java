package com.gams.Loops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num1 ");
          int num1= sc.nextInt();
        System.out.println("enter the num2 ");
        int num2 = sc.nextInt();
        System.out.println("1.ADD,2.SUB,3.MUL,4.DIV,5.EXIT");
        System.out.println("enter the choice");
        int ch=sc.nextInt();
        switch (ch) {
            case 1 -> {
                int res = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + res);
            }
            case 2 -> {
                int res = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + res);
            }
            case 3 -> {
                int res = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + res);
            }
            case 4 -> {
                int res = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + res);
            }
            default -> System.out.println("thankyou");
        }
    }
}
