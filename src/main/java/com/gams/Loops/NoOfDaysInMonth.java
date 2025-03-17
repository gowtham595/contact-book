package com.gams.Loops;

public class NoOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(numofdays(8, 2023));
        System.out.println(numofdays(2, 2024));
    }

    public static int numofdays(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9 -> 30;
            case 2 -> {
                if (year % 4 == 0 && year % 100 != 0) {
                    yield 29;
                } else {
                    yield 28;
                }
            }

            default -> throw new IllegalArgumentException();
        };
    }
}
