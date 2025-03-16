package com.gams.Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num:");
        int num = sc.nextInt();

        int i =1;
        int fact=1;
        while (i<=num) {
            fact *= i;
            i++;
        }
        System.out.println("factorial of "+num+" : "+fact);
    }
}
