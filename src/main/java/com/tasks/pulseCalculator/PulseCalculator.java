package com.tasks.pulseCalculator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PulseCalculator {
    public static void main(String[] args) {
        Path p = Paths.get("pulseCalcConfig.txt");
        try {
            String lines = Files.readString(p);
            String[] split = lines.split(",");
            int age = Integer.parseInt(split[0]);
            int pulse = Integer.parseInt(split[1]);
// Calculation is based on Carvonen's formula
            final int maxHR = 220 - age;
            int targetHR = getTargetHR(maxHR, pulse);
            List<Long> actZones = getActivityZones(targetHR, pulse);
            System.out.println("Your light activity cardiozone is " + actZones.get(0) + " - " + actZones.get(1));
            System.out.println("Your fat-burning cardiozone is " + actZones.get(1) + " - " + actZones.get(2));
            System.out.println("Your aerobic cardiozone is " + actZones.get(2) + " - " + actZones.get(3));
            System.out.println("Your anaerobic activity cardiozone is " + actZones.get(3) + " - " + actZones.get(4));
            System.out.println("Your VO2 cardiozone is " + actZones.get(4) + " - " + maxHR);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("The config file is empty. Please, add data and try again");
        }
    }

    public static int getTargetHR(int maxHR, int pulse) throws IllegalArgumentException {
        if (pulse == 0) {
            throw new IllegalArgumentException("Please, enter valid numbers");
        }
        return maxHR - pulse;
    }

    public static List<Long> getActivityZones(int a, int b) {
        List<Long> actZones = new ArrayList<>();
        for (int i = 5; i < 10; i++) {
            double coefficient = (double) i / 10d;
            actZones.add(Math.round(a * coefficient) + b);
        }
        return actZones;
    }
}