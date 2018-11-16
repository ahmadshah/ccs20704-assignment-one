package msu.oop.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberTest
{
    Number number;

    @BeforeEach
    void setUp() {
        this.number = new Number(1);
    }

    @Test
    void getNumber() {
        assertEquals(1, this.number.getNumber());
    }

    @Test
    void setNewNumber() {
        this.number.setNumber(8);

        assertEquals(8, this.number.getNumber());
    }

    @Test
    void isNumberPositive() {
        assertTrue(this.number.isPositive());
    }

    @Test
    void isNumberNegative() {
        this.number.setNumber(-8);

        assertFalse(this.number.isPositive());
    }

    @Test
    void isItAnEvenNumber() {
        this.number.setNumber(70);

        assertTrue(this.number.isEven());
    }

    @Test
    void isItAnOddNumber() {
        this.number.setNumber(197);

        assertFalse(this.number.isEven());
    }
}