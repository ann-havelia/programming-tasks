package com.tasks.programmersDay;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;

public class ProgrammersDay {

    public static void main(String[] args) {
        Path p = Paths.get("programDayConfig.txt");

        try {
            int year = Integer.parseInt(Files.readString(p));

            System.out.println(returnDay(year));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String returnDay(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, Calendar.JANUARY, 1);
        cal.add(Calendar.DATE, 255);
        int day = cal.get(Calendar.DAY_OF_WEEK);

        String weekDay = "";
        switch (day) {
            case Calendar.SUNDAY:
                weekDay = "Sunday";
                break;
            case Calendar.MONDAY:
                weekDay = "Monday";
                break;
            case Calendar.TUESDAY:
                weekDay = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                weekDay = "Wednesday";
                break;
            case Calendar.THURSDAY:
                weekDay = "Thursday";
                break;
            case Calendar.FRIDAY:
                weekDay = "Friday";
                break;
            case Calendar.SATURDAY:
                weekDay = "Saturday";
                break;

        }
        return weekDay;
    }
}
