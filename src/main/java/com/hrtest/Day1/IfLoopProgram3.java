package com.hrtest.Day1;

import java.util.Scanner;

public class IfLoopProgram3 {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program Started");
        int inputNumber = scanner.nextInt();
        scanner.close();
        IfLoopProgram3 ifLoopProgram3 = new IfLoopProgram3();
        System.out.println(ifLoopProgram3.checkNumber(inputNumber));
    }

    public String checkNumber(int n) {
        return (n % 2 == 0 && (n >= 2 && n <= 5 || n > 20))
                ? "Not Weird" : "Weird";
    }
}