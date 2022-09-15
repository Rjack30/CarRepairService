package Abstractclasses;

public class Service {
    private final int number = 0;
    String name;
    double servicePrice;

    public Service(String name, int servicePrice) {
        System.out.println("The  Price of Service: 100 dollars ");
        this.name = name;
        this.servicePrice = number;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public String toString() {
        return name + " " + servicePrice;
    }

    public String getName() {
        return name;
    }
    public double getNumber() {
        return number;
    }













}
