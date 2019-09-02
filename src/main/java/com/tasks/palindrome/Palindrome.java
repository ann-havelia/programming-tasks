package com.tasks.palindrome;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Palindrome {

    public static void main(String[] args) {
        Path p = Paths.get("palindromeConfig.txt");
        try {
            String word = Files.readString(p);
            if(word.equals("")){
                System.out.println("The config file is empty");
            }else if (palindromeCheck(word)) {
                System.out.println("It is a palindrome");
            } else {
                System.out.println("It is not a palindrome");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean palindromeCheck(String s) {
        boolean isPalindrome;
        StringBuilder word = new StringBuilder(s);
        String reverseWord = word.reverse().toString();
        isPalindrome = reverseWord.equalsIgnoreCase(s);
        return isPalindrome;
    }
}
