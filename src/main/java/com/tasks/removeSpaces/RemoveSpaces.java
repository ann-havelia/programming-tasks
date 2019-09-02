package com.tasks.removeSpaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RemoveSpaces {
    public static void main(String[] args) {
        Path p = Paths.get("removeSpaceConfig.txt");
        try {
            String str = Files.readString(p);
            System.out.println(removeSpaces(str));
            System.out.println(removeSpaces1(str));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String removeSpaces(String str) {
        StringBuilder noSpaces = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                noSpaces.append(str.charAt(i));
            }
        }
        return noSpaces.toString();
    }

    public static String removeSpaces1(String str) {
        return str.replaceAll("\\s", "");
    }

}
