package msu.oop.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

class RoomTest
{
    Room room;

    @BeforeEach
    void setUp() {
        this.room = new Room(15, 25);
    }

    @Test
    void getLength() {
        assertEquals(15, this.room.getLength());
    }

    @Test
    void getWidth() {
        assertEquals(25, this.room.getWidth());
    }

    @Test
    void setNewLength() {
        this.room.setLength(10);

        assertEquals(10, this.room.getLength());
    }

    @Test
    void setNewWitdh() {
        this.room.setWidth(10);

        assertEquals(10, this.room.getWidth());
    }

    @Test
    void calculateFloorSpace() {
        assertEquals(375, this.room.calculateFloorSpace());
    }

    @Test
    void floorSpaceOutput() {
        assertEquals("The floor space is 375 square feet.", this.room.toString());
    }
}