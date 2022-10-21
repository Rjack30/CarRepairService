package dao;

public class Mechanic {

    public String name;
    public String lastName;

    public Mechanic(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "[" + name + " " + lastName + "]";
    }


}
