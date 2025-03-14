package com.gams.day5;

public class MathExample {
    public static void main(String[] args) {
    }

    public static int max(int a, int b) {
        return Math.max(a,b);
    }

    public static int sum(int a, int b) {
        return (a+b);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
    return fact;
    }


    public static int sumofNNaturalnum(int num) {
        return 0;
    }
    public static boolean isEven(int num){
        return false;
    }
    public static int FirstNEvennum(int n){
        return 0;
    }
    public static int FirstNOddnum(int n){
        return 0;
    }
}



