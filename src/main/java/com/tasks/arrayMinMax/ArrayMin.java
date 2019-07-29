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
            String[] line = lines.split(",");

            minNumber1(line);
            minNumber2(line);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int minNumber1(String[] a) {
        int[] num = Arrays.stream(a).mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(num);
        return num[0];
    }

    public static int minNumber2(String[] a) {
        int[] num = Arrays.stream(a).mapToInt(Integer::parseInt)
                .toArray();

        int minNumber = num[0];

        for (int i : num) {
            if (i < minNumber) {
                minNumber = i;
            }
        }
        return minNumber;

    }
}


