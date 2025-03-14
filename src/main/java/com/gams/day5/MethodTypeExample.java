package com.gams.day5;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Locale;

public class MethodTypeExample {

    public static void main(String[] args) {
        System.out.println(greetings("krish"));
        System.out.println(getSysteminfo());
        showGreetings("welcome to java full stack");
        showSystemDateandTime();
    }

    public static  String greetings (String username){// method with return type with arguments
        String greet = "welcome to java world!";
        return "Hello "+username+ ",\n\t"+greet;
    }
    public static String getSysteminfo() {//method with return type without arguments
        //logic to get system properties
      return "windows-14";
    }
    public static void showGreetings (String message) {//without return type with arguments usevoid
        System.out.println(message);

    }
    public static void showSystemDateandTime(){//method with no return types and no arguments
        System.out.println(LocalDateTime.now());

    }


}




