package org.chandrayan.ts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverClassTest {
    DriverClass driverClass = new DriverClass();
    Chandrayan chandrayan = new Chandrayan();

    @Test
    public void testTurnUpwards() {
        assertEquals('U',chandrayan.turnUpwards());
    }

    @Test
    public void testTurnDownwards() {
        assertEquals('D', chandrayan.turnDownwards());
    }

    @Test
    public void testTurnLeft() {
        assertEquals('L',chandrayan.turnLeft());
    }

    @Test
    public void testTurnRight() {
        assertEquals('R',chandrayan.turnRight());
    }
}
