package com.tasks.dateDifference;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifference {
    public static void main(String[] args) {
        Path p = Paths.get("dateDiffConfig.txt");

        try {
            String line1 = Files.readAllLines(p).get(0);
            String line2 = Files.readAllLines(p).get(1);

            System.out.println(dateDifference(line1,line2));

        } catch (IOException e) {
            e.printStackTrace();
        }
        }


    public static long dateDifference(String a, String b) {
        long res = 0;

        try {
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

            Date firstDate = format.parse(a);
            Date secondDate = format.parse(b);


            long result = firstDate.getTime() - secondDate.getTime();
            res = (result / (1000 * 60 * 60 * 24));
            return Math.abs(res);


        } catch (Exception e) {
            System.out.println(e);
        }
        return Math.abs(res);
    }
}
