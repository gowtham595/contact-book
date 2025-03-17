package com.gams.Loops;

public class BooleanExample {
        public static void main(String[] args) {
            int num = 123;
            boolean isArmstrong = checkArmstrong(num);
            System.out.println(isArmstrong);  // Output: true
        }

        public static boolean checkArmstrong(int num) {
            int originalNum = num, sum = 0, numDigits = 0;

            // Count digits
            for (int temp = num; temp > 0; temp /= 10) {
                numDigits++;
            }

            // Compute sum of powered digits
            for (int temp = num; temp > 0; temp /= 10) {
                int digit = temp % 10;
                int power = 1;

                // Compute digit^numDigits
                for (int i = 0; i < numDigits; i++) {
                    power *= digit;
                }

                sum += power;
            }

            return sum == originalNum;
        }
    }

