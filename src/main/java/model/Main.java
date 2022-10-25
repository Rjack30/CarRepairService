package model;


import dao.Car;
import dao.Mechanic;

import java.util.logging.Logger;

public class Main {

    private static final String Car_Repair_DEBUG = "@@@@@@@@@@@";
    private static final String Car_Repair_WARN = "^^^^^^^^^^^";
    private static final String Car_Repair_INFO = "*************";
    private static final String Car_Repair_ERROR = "############";
    private static final String Car_Repair_FATAL = "$$$$$$$$$$";
    
    private static java.util.logging.LogManager LogManager;
    private static final Logger logger = LogManager.getLogger(String.valueOf(City.class));

    public static void main(String[] args) {

        var person1 = new Mechanic("Jonh", "Gold");
        var person2 = new Mechanic("James", "Miller");
        // create 2 cars
        var car1 = new Car(" BMW M3", 2013, person1);
        var car2 = new Car("Mercedes-Benz E550", 2017, person2);

        public static void debug (Logger Object String;
        logger, String message){
            logger.debug(Car_Repair_DEBUG + message + Car_Repair_DEBUG);
        }

        // logging
        logger.debug(" Car_Repair_Debug + message");
        logger.info("Person1: " + person1);
        logger.info("Car2: " + car2);
        logger.warning("Warning accrued at " + LocalDateTime.now());
        logger.error("Error accrued at " + LocalDateTime.now());
        logger.fatal("Serious problem with car " + car1 + " accrued at " + LocalDateTime.now());
        Scanner input = new Scanner(System.in);

        String[] offers = new String[]{"OilChange", "SuspensionServices",
                "TransmissionRepair", "BrakeServices"};

        int[] prices = {120, 80, 200, 75};

        System.out.println("Enter Selection:");
        String choice = input.nextLine();


        for (int x = 0; x < prices.length; ++x) {
            if (offers[x].equals(choice)) {
                System.out.println(offers[x] + " price is $" + prices[x]);
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
                " is traveling at ");
        System.out.println("What is the year of your car? ");
        yearModel = keyboard.nextInt();

        System.out.println("What is the make of your car? ");
        make = keyboard.next();


    }

}
