package com.win.junit;
import java.util.Scanner;
class TestScores{
    public static void main(String[] args) {
    Scanner inputscore = new Scanner(System.in);

    System.out.println("Name a number between 0 and 100");
    int number = Integer.valueOf(inputscore.nextLine());

    //This if statement will determine the letter graded based on the number between 0-100

    if(number >=90){
        System.out.println("Your grade is an A :)");
        } else if (number >= 80 && number <90){
            System.out.println("Your grade is an B :)");
        }else if (number >=70 && number <80){
            System.out.println("Your grade is an C -_-");
        }else if (number >=60 && number < 70){
            System.out.println("Your grade is an D :(");
        } else{
            System.out.println("Your grade is an F :(");
        }
    inputscore.close();

    }
}