package msu.oop.assignment.jusco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest
{
    Customer customer;

    @BeforeEach
    void setUp() {
        String name = "Ahmad Shah Hafizan Hamidin";
        String address = "Goodyear Court 10, USJ, 47630 Subang, Selangor";
        int point = 500;

        this.customer = new Customer(name, address, point);
    }

    @Test
    void calculatePoint() {
        assertEquals(550, this.customer.calculatePoint());
    }
}