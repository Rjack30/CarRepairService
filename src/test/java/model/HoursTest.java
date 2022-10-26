package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoursTest {
    @Test
    void nameOfCity() {
        var hours = new OperatingHours();
        assertTrue(hours.add(2, 2) == 4);
}