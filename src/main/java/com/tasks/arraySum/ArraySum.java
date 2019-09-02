package com.tasks.arraySum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        Path p = Paths.get("arraySumConfig.txt");
        try {
            String lines = Files.readString(p);
            if (lines.equals("")) {
                System.out.println("The array is empty");
            } else {
                String[] line = lines.split(",");
                int[] array = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
                System.out.println(sumManual(array));
                System.out.println(sumFunction(array));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int sumManual(int[] a) throws IllegalArgumentException {
        if (a.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static int sumFunction(int[] a) throws IllegalArgumentException {
        if (a.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        return Arrays.stream(a).sum();
    }
}