package com.tasks.passwordCheck;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class PasswordCheck {
    public static void main(String[] args) {
        Path p = Paths.get("passwordConfig.txt");
        try {
            String password = Files.readString(p);
            if (passwordCheck(password)) {
                System.out.println("Password validation success");
            } else {
                System.out.println("Password validation failed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean passwordCheck(String s) {
        boolean validPass;
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_])(?=\\S+$).{8,}";
        validPass = s.matches(pattern);
        return validPass;
    }
}
