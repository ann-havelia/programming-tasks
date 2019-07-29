package com.tasks.pulseCalculator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PulseCalculator {
    public static void main(String[] args) {
        Path p = Paths.get("pulseCalcConfig.txt");

        try {
            String lines = Files.readString(p);

            String[] split = lines.split(",");
            int age = Integer.parseInt(split[0]);
            int pulse = Integer.parseInt(split[1]);
// Calculation is based on Carvonen's formula

            int maxHR = getMaxHR(age);
            int targetHR = getTargetHR(maxHR, pulse);

            long[] actZones = getActivityZones(targetHR, pulse);

            System.out.println("Your light activity cardiozone is " + actZones[0] + " - " + actZones[1]);
            System.out.println("Your fat-burning cardiozone is " + actZones[1] + " - " + actZones[2]);
            System.out.println("Your aerobic cardiozone is " + actZones[2] + " - " + actZones[3]);
            System.out.println("Your anaerobic activity cardiozone is " + actZones[3] + " - " + actZones[4]);
            System.out.println("Your VO2 cardiozone is " + actZones[4] + " - " + maxHR);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int getMaxHR(int a) {
        return 220 - a;
    }

    public static int getTargetHR(int maxHR, int b) {
        return maxHR - b;
    }

    public static long[] getActivityZones(int a, int b) {
        long[] actZones = new long[5];
        actZones[0] = Math.round(a * 0.5) + b;
        actZones[1] = Math.round(a * 0.6) + b;
        actZones[2] = Math.round(a * 0.7) + b;
        actZones[3] = Math.round(a * 0.8) + b;
        actZones[4] = Math.round(a * 0.9) + b;

        return actZones;
    }
}



