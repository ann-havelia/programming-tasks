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

            String[] line1 = lines.split(",");
            String[] line2 = lines1.split(",");

            System.out.println(commonElements1(line1, line2));
            System.out.println(commonElements2(line1, line2));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String commonElements1(String[] a, String[] b) {
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

    public static String commonElements2(String[] a, String[] b) {
        ArrayList<String> array1 = new ArrayList<>(Arrays.asList(a));
        ArrayList<String> array2 = new ArrayList<>(Arrays.asList(b));
        array1.retainAll(array2);
        return array1.toString();
    }

}

