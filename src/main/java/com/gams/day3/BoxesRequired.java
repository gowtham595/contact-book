package com.gams.day3;

import java.util.Scanner;

public class BoxesRequired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the totalitems");
        int totalitems = sc.nextInt();

        System.out.println("Enter the boxcapacity");
        int boxcapacity =sc.nextInt();

        System.out.println();
        int boxes = totalitems/boxcapacity;

        if (totalitems%boxcapacity !=0);{ //if total items remained after the box capacity is not 0
                                                 // then increase the no of boxes by one
            boxes += 1;
        }

        System.out.println("The no of Boxes reqired to pack "+totalitems+" is "+ boxes+"" );

    }
}
