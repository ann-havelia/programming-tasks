package com.tasks.wordCount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    public static void main(String[] args) {
        Path p = Paths.get("wordCountConfig.txt");
        try {
            String sentence = Files.readAllLines(p).get(0);
            String word = Files.readAllLines(p).get(1);
            System.out.println(count(sentence, word));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The data is missing from the config file. Please, add needed data and try again. " + e);
        }
    }

    public static int count(String a, String b) {
        String[] str = a.split("\\s|,");
        int count = 0;
        for (String i : str)
            if (i.equalsIgnoreCase(b)) {
                count++;
            }
        return count;
    }
}
