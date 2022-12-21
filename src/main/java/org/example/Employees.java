package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employees {

    // create Scanner object
    public static Scanner sc = new Scanner(System.in);
    private List<String> tempList = new ArrayList<>();
    // create List generator method
    public List<String> generateIntArrayList() {

        // create list



        // names of employee
        String count = "";

        System.out.println("Enter 5 Employees (press enter after every Every Name):\nPress 6 to close the menu.");
        String answer = "";
        // while there is an integer entered in the console
        while(answer.equals("6") == false) {
            // add next string to list
            answer = sc.nextLine();
            if(answer.equals("6") == false)
            {
                tempList.add(answer);
            }

            // prevent I/O test from reading next int from input

        }
        traverseList();
        // return the list with 5 elements added to it
        return tempList;
    }

    public void traverseList()
    {
        for(int i = 0; i < tempList.size(); i++)
        {
            System.out.println("Value at "+i+" "+tempList.get(i));
        }
    }

}
