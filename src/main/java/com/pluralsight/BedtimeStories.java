package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String userText;
        String fileDirectory = "src/main/resources/";

        System.out.println("""
                Which bedtime story would you like to read
                1. Goldilocks
                2. Hansel and Gretel
                3. Mary had a little lamb
                """);
        userText = userInput.nextLine();

        int answer = Integer.parseInt(userText);
        switch (answer) {
            case 1 -> {
                fileDirectory += "goldilocks.txt";
            }
            case 2 -> {
                fileDirectory += "hansel_and_gretel.txt";
            }
            case 3 -> {
                fileDirectory += "mary_had_a_little_lamb.txt";
            }
            default -> {
                System.out.println("Sorry, that's not available.");
            }
        }

        try {
            FileReader fileReader = new FileReader(fileDirectory);
            BufferedReader buffReader = new BufferedReader(fileReader);

            String line = "";
            int counter = 1;
            while (line != null) {
                line = buffReader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(counter + ". " + line);
                counter++;
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found in " + e.getMessage() );
        }
        catch (IOException e) {
            System.err.println("IDK " + e.getMessage() );
        }
    }
}
