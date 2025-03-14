package com.gams.day4;

public class BreakExample {
    public static void main(String[] args) {
        System.out.println("start of  the main method ");
        for (int i=1; i<=10; i++){
            if (i % 3==0 && i%6==0){
                break;
            }
            System.out.println(i);
        }
        System.out.println("end of the program ");
    }
}
