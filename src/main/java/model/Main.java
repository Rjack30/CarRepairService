package model;

import dao.Mechanic;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Thank You for Contacting Rod Auto-care Shop");
        System.out.println("Are You Looking To Get Your Car Service today?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");

        int value = scanner.nextInt();

        switch (value) {

            case 1:
                Mechanic.main();
                Offices.main();
                Payments.main();
                System.out.println("\n");
                Mechanic.setUp();
                System.out.println("\n");
                System.out.println("Thank you for choosing us! Here is a list of our current Mechanics  ");
                Mechanic.getMechanicsFromDataBase();
                System.out.println("\n");
                Offices.setUp();
                System.out.println("\n");
                System.out.println("Here are the available Offices that our mechanics can work at");
                Offices.getCourthousesFromDataBase();
                System.out.println("\n");
                Payments.setUp();
                System.out.println("\n");
                System.out.println("These are the current Payment Methods");
                Payments.getPaymentFromDataBase();
                System.out.println("\n");
                break;

            case 2:
                System.out.println("We will be here whenever your car needs some work done to it!");
                break;

        }
    }
}




