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
            String[] line = lines.split(",");

            System.out.println(maxNumber1(line));
            System.out.println(maxNumber2(line));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int maxNumber1(String[] a) {


        int[] num = Arrays.stream(a).mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(num);
        return num[num.length - 1];}


    public static int maxNumber2(String[] a) {
        int[] num = Arrays.stream(a).mapToInt(Integer::parseInt)
                .toArray();
        int maxNumber = num[0];


        for (int i : num) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }
}
