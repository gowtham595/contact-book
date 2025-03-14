package com.gams.day4;

public class NumbersDivisibleby6and9 {
    public static void main(String[] args) {
        int n=15;
        int count=0;
        for (int i = 1; ; i++){
            if (i % 6==0 && i%9==0) {
                System.out.println(i + "");
                count++;
            }
        if (n == count) {
            break;
        }
        }
    }
}
