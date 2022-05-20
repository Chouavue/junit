package com.win.junit;

import java.util.Scanner;

public class Calculations{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number: ");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int addnum = num1 + num2;
        System.out.println(num1 + " + " + num2 +" = " + addnum);

        int subtractnum = num1 - num2;
        System.out.println(num1 + " - " + num2 +" = " + subtractnum);

        int multiplynum = num1 * num2;
        System.out.println(num1 + " * " + num2 +" = " + multiplynum);

        double divisionnum = (float)num1/num2;
        System.out.println(num1 + " / " + num2 +" = " + divisionnum);

        int modulsnum = num1 % num2;
        System.out.println(num1 + " % " + num2 +" = " + modulsnum);

        scanner.close();
    }
}