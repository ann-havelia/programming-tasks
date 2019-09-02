package com.tasks.arrayCommon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCommonElements {

    public static void main(String[] args) {
        Path p = Paths.get("arrayCommonConfig.txt");
        try {
            String lines = Files.readAllLines(p).get(0);
            String lines1 = Files.readAllLines(p).get(1);
            if (lines.equals("") || lines1.equals("")) {
                System.out.println("The array is empty");
            } else {
                String[] line1 = lines.split(",");
                String[] line2 = lines1.split(",");
                System.out.println("The result of the manual search for common elements of two arrays is: "+ commonElementsManual(line1, line2));
                System.out.println("The result of the search for common elements of two arrays using the built-in function is: "+ commonElementsFunction(line1, line2));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String commonElementsManual(String[] a, String[] b) {
        List<String> common = new ArrayList<>();
        for (String s : a) {
            for (String s1 : b) {
                if (s.equals(s1)) {
                    common.add(s);
                }
            }
        }
        return common.toString();
    }

    public static String commonElementsFunction(String[] a, String[] b) {
        ArrayList<String> array1 = new ArrayList<>(Arrays.asList(a));
        ArrayList<String> array2 = new ArrayList<>(Arrays.asList(b));
        array1.retainAll(array2);
        return array1.toString();
    }

}

