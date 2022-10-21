package model;
import java.util.Scanner;

import dao.Car;
import dao.Mechanic;
import dao.SportEvent;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import java.time.LocalDateTime;


public class Main {


    private static final Logger logger = LogManager.getLogger(City.class);
    public static void main(String[] args) {

        var person1 = new Mechanic("Jonh", "Gold");
        var person2 = new Mechanic("James", "Miller");
        // create 2 cars
        var car1 = new Car(" BMW M3", 2013, person1);
        var car2 = new Car("Mercedes-Benz E550", 2017, person2);
        // logging
        logger.debug("Some debug log");
        logger.info("Person1: " + person1);
        logger.info("Car2: " + car2);
        logger.warn("Warning accrued at " + LocalDateTime.now());
        logger.error("Error accrued at " + LocalDateTime.now());
        logger.fatal("Serious problem with car " + car1 + " accrued at " + LocalDateTime.now());
        Scanner input = new Scanner(System.in);

        String[] offers = new String[]{"OilChange", "SuspensionServices",
                "TransmissionRepair", "BrakeServices"};

        int[] prices = {120, 80, 200, 75};

        System.out.println("Enter Selection:");
        String choice = input.nextLine();


        for(int x = 0; x < prices.length; ++x){
            if(offers[x].equals(choice)){
                System.out.println(offers[x] +" price is $" + prices[x]);
                return;
            }
        }
        System.out.println("Invalid Entry");
    }
    public static void main(String[] args) {

        int yearModel = 0;
        String make = null;

        Scanner keyboard = new Scanner(System.in);

        Car car = new Car();

        System.out.println("What is the year of the car?");
        yearModel = keyboard.nextInt();

        System.out.println("What is the make of the car?");
        keyboard.nextLine(); // fixes bug - receives the Enter key without skipping make = keyboard.nextLine()
        make = keyboard.nextLine();

            System.out.println("Your " + yearModel + " " + make +
                    " is traveling at " );
    System.out.println("What is the year of your car? ");
    yearModel = keyboard.nextInt();

    System.out.println("What is the make of your car? ");
    make = keyboard.next();


}

