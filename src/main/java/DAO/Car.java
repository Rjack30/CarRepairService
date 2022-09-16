package DAO;

public class Car {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
    }

    public Car(String s, int i, Mechanic person2) {
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }


}
