package com.gams.day4;

import java.util.Scanner;

public class FactorsofTheGivennum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num=3;
        for (int i =1; i<=num; i++) {
            if (num % i == 0){
                System.out.println(i+"");
                count++;
            }
        }
        System.out.println("factors count of "+num+":"+count);
    }

}
