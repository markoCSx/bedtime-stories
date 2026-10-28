package com.pluralsight;

import java.util.Scanner;

public class BedtimeStories {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String userText;

        System.out.println("""
                Which bedtime story would you like to read
                Goldilocks
                Hansel and Gretel
                Mary had a little lamb
                """);
        userText = userInput.nextLine();
    }
}
