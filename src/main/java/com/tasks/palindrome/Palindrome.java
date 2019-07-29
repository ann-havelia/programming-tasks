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
            if(palindromeCheck(word)){
                System.out.println("It is a palindrome");
            }else{
                System.out.println("It is not a palindrome");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
}
public static boolean palindromeCheck(String s){
    boolean isPal;

    StringBuilder s1 = new StringBuilder(s);
    String rev = s1.reverse().toString();

    isPal = rev.equalsIgnoreCase(s);

return isPal;
    }
}
