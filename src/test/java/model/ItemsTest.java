package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemsTest {
    @Test
    void nameOfCity() {
        var city = new City();
        assertTrue(city.add(2, 2) == 4);
}