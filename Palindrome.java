package org.example;

public class Palindrome {


    public static void main(String[] args) {
        
        System.out.println("starting...");
        String str = "mom";
        checkPalindrome(str);
    }


    // Palindrome is a word which is same RTL and LTR
    private static void checkPalindrome(String phrase) {

        StringBuilder stringBuilder = new StringBuilder(phrase);

        if(phrase.equalsIgnoreCase(stringBuilder.reverse().toString())){
            System.out.println("The input string "+ phrase +" is palindrome");
        }else {
            System.out.println("The input string "+ phrase +" is not a palindrome");
        }

    }
}