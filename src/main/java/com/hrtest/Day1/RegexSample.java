package com.hrtest.Day1;

import java.util.Scanner;

public class RegexSample {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter String here:");
        String input = s1.next();
        for(int i=0;i<input.length();i++)
        {
            if(isDigitCheck(input.charAt(i))){
                System.out.print("yes");
                break;
            }
//            System.out.println(input.charAt(i));
        }
    }

    private static boolean isDigitCheck(char c) {
        return true;
    }
}
