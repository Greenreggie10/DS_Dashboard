package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("----------------Employee's Name-----------------");
        System.out.println("-----------------------------------------------\n");
        Employees e = new Employees();
        List<String> intListExample = e.generateIntArrayList();
        System.out.println("Employees you added to the first list:");
        for (String name : intListExample) {
            System.out.println(name);
        }

        System.out.println("------------------------------------------------");
        System.out.println("----------------Employee's Status-----------------");
        System.out.println("-----------------------------------------------\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! Please select drivers status e:\n"
                + "1) SleeperBirth\n"
                + "2) Driving\n"
                + "3) Restroom Break\n"
                + "and any other number for off duty!");



        int choice = sc.nextInt();

        switch(choice) {
            case 1: System.out.println("Driver is Sleeping...zzz!");
                break;
            case 2: System.out.println("Driver is driving enroute!");
                break;
            case 3: System.out.println("Driver is occupying restroom!");
                break;
            default: System.out.println("Driver must be Off duty!");
                break;
        }

        sc.close();

        System.out.println("------------------------------------------------");
        System.out.println("----------------Employee's Destination-----------------");
        System.out.println("-----------------------------------------------\n");



        Destination emp = new Destination();
        HashSet<String> selectedstates = emp.GetUserChoice();
        System.out.println("Employees selection of states");
        for (String name : selectedstates) {

            System.out.println(name);
        }

        System.out.println("------------------------------------------------");
        System.out.println("----------------Employee's Package-----------------");
        System.out.println("-----------------------------------------------\n");

        System.out.println("------------------------------------------------");
        System.out.println("----------------Employee's Final Route-----------------");
        System.out.println("-----------------------------------------------\n");

        Route driverChoice = new Route("","",choice);
    }
}