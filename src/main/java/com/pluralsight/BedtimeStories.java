package com.pluralsight;

import java.util.Scanner;

public class BedtimeStories {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String userText;

        System.out.println("""
                Which bedtime story would you like to read
                1. Goldilocks
                2. Hansel and Gretel
                3. Mary had a little lamb
                """);
        userText = userInput.nextLine();
        int answer = Integer.parseInt(userText);
        String bedTimeStory = "";
        switch (answer) {
            case 1 -> {
                bedTimeStory = "goldilocks.txt";
            }
            case 2 -> {
                bedTimeStory = "hansel_and_gretel.txt";
            }
            case 3 -> {
                bedTimeStory = "mary_had_a_little_lamb.txt";
            }
            default -> {
                System.out.println("Sorry, that's not available.");
            }
        }

    }
}
