package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void nameOfCity() {
        var customer = new Customer();
        assertTrue(customer.add(2, 2) == 4);
    }
}