package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class Destination {
    private HashSet<String> states = new HashSet<String>();
    private HashSet<String> answers = new HashSet<String>();
    private Scanner scan ;
    public Destination()
    {
        populate();
        scan = new Scanner(System.in);
    }

    public void populate()
    {
        states.add("alabama");
        states.add("alaska");
        states.add("arizona");
        states.add("arkansas");
        states.add("california");
        states.add("colorado");
        states.add("connecticut");
        states.add("delaware");
        states.add("florida");
        states.add("georgia");
        states.add("hawaii");
        states.add("idaho");
        states.add("illinois");
        states.add("indiana");
        states.add("iowa");
        states.add("kansas");
        states.add("kentucky");
        states.add("louisiana");
        states.add("maine");
        states.add("maryland");
        states.add("massachusetts");
        states.add("michigan");
        states.add("minnesota");
        states.add("mississippi");
        states.add("missouri");
        states.add("montana");
        states.add("nebraska");
        states.add("nevada");
        states.add("new hampshire");
        states.add("new jersey");
        states.add("new mexico");
        states.add("new york");
        states.add("north carolina");
        states.add("north dakota");
        states.add("ohio");
        states.add("oklahoma");
        states.add("oregon");
        states.add("pennsylvania");
        states.add("rhode island");
        states.add("south carolina");
        states.add("south dakota");
        states.add("tennessee");
        states.add("texas");
        states.add("utah");
        states.add("vermont");
        states.add("virginia");
        states.add("washington");
        states.add("west virginia");
        states.add("wisconsin");
        states.add("wyoming");
    }

    public HashSet<String> GetUserChoice()
    {

        // if 'answers' is smaller than 'states' we haven't guess all 50 states yet
        while (answers.size() < 3) {
            // Ask the user to enter a state
            System.out.println("Please enter State you would like to deliver to next:");

            // change input to make it case-insensitive
            String input = "";
            input = scan.nextLine();
            input = input.toLowerCase();
            // Check if the user input is an actual state
            if (states.contains(input)) {

                // if the input was correct, lets try to add it to our collection
                if (answers.add(input)) {
                    // if the input was added to the collection, print this statement
                    System.out.println("You've added: " + input + " to the collection!");
                } else {
                    // if the input was not added, it means they've already guess that state
                    System.out.println("Sorry, you've already added: " + input + " previously!");
                }
            } else {
                System.out.println("Sorry: " + input + " is not a State! (double check your spelling)");
            }

            // This message tells the user how many more states to guess.
            System.out.println(states.size() - answers.size() + " more to go!");
        }


        return answers;
    }
}
