package com.gams.Loops;

import javax.tools.SimpleJavaFileObject;

public class NumberOperations {
    public static void main(String[] args) {
         int num= 12345;
        System.out.println(sumofdigits(num));
        System.out.println(reverse(num));

    }
    public static int reverse (int num){
        if (num>0&&num<=9){
            return num;
        }
        int rev=0;
        while(num != 0){
            int r = num % 10 ;
            rev = rev * 10 + r;
            num/=10;
        }
        return rev;
    }
    public static int sumofdigits(int num){
        if (num>0 && num<=9){
            return num;
        }
        int sum = 0;
        while (num!=0){
            int r=num%10;
            sum+=r;
            num/=10;
        }
        return sum;
    }
}
