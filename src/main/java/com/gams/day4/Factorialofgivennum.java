package com.gams.day4;

import java.util.Scanner;

public class Factorialofgivennum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int num=1;
        for (int i =1; i<=n; i++) {
            num*= i;
        }
        System.out.println("factorial of the given num  "+n+" is "+num+"");
    }

}
