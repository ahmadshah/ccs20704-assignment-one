package msu.oop.assignment.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTest
{
    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        this.rectangle = new Rectangle(10.5, 12.5);
    }

    @Test
    void calculatePerimeter() {
        assertEquals(46, this.rectangle.perimeter());
    }
}