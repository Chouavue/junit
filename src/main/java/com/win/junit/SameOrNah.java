package com.win.junit;
import java.util.Scanner;

class SameOrNah{
    public static void main(String[] args) {
        Scanner inputword= new Scanner(System.in);

        System.out.println("Enter a word:");
        String word1 =(inputword.nextLine());

        System.out.println("Enter another word:");
        String word2 = (inputword.nextLine());

        if(word1.equals(word2)){
            System.out.println("The words are the same.");
        }else{
            System.out.println("The words are different.");
        }

        inputword.close();
    }
}