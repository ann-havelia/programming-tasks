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

            String[] line = lines.split(",");

            System.out.println(sum1(line));
            System.out.println(sum2(line));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     public static int sum1(String[] a) {
        int[] array = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

     public static int sum2(String[] a) {
        int[] array = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
         return Arrays.stream(array).sum();
    }
}