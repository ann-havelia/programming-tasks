package com.tasks.arrayMinMax;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ArrayMax {
    public static void main(String[] args) {
        Path p = Paths.get("arrayMinMaxConfig.txt");
        try {
            String lines = Files.readString(p);
            if (lines.equals("")) {
                System.out.println("The array is empty");
            } else {
                String[] line = lines.split(",");
                int[] num = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
                System.out.println("The max number in the array is " + maxNumberWithFunc(num));
                System.out.println("The max number in the array is " + maxNumberWithLoop(num));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int maxNumberWithFunc(int[] a) throws IllegalArgumentException {
        if (a.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public static int maxNumberWithLoop(int[] a) throws IllegalArgumentException {
        if (a.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        } else {
            int maxNumber = a[0];
            for (int i : a) {
                if (i > maxNumber) {
                    maxNumber = i;
                }
            }
            return maxNumber;
        }
    }
}