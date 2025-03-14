package com.gams.day5;

public class ContinueExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (int i : arr) {
            // skip num which is even and divisible by3
            if (isEvenAndDivisibleBy3(i)) {
                continue;
            }
                System.out.println(i);
            }
        }
        public static boolean isEvenAndDivisibleBy3(int num){
            return num% 2 ==0 && num% 3 ==0;
        }
    }

