package DAO;

import java.util.HashMap;

public class City {
    public static void main(String[] args) {
        HashMap<String, String> stateCities = new HashMap<>();
        stateCities.put("California", "Los Angeles");
        for (String i : stateCities.keySet()) {
            System.out.println("key: " + i + " value: " + stateCities.get(i));
        }
    }
}





