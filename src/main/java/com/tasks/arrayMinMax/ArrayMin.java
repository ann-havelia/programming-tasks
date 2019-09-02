package com.tasks.arrayMinMax;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ArrayMin {
    public static void main(String[] args) {
        Path p = Paths.get("arrayMinMaxConfig.txt");
        try {
            String lines = Files.readString(p);
            if (lines.equals("")) {
                System.out.println("The array is empty");
            } else {
                String[] line = lines.split(",");
                int[] num = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
                System.out.println("The min number in the array is " + minNumberWithFunc(num));
                System.out.println("The min number in the array is " + minNumberWithLoop(num));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int minNumberWithFunc(int[] a) throws IllegalArgumentException {
        if (a.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        Arrays.sort(a);
        return a[0];
    }

    public static int minNumberWithLoop(int[] a) throws IllegalArgumentException {
        if (a.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        } else {
            int maxNumber = a[0];
            for (int i : a) {
                if (i < maxNumber) {
                    maxNumber = i;
                }
            }
            return maxNumber;
        }
    }
}


