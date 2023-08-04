package org.chandrayan.ts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class DriverClassTest {
    DriverClass driverClass = new DriverClass();
    Chandrayan chandrayan = new Chandrayan();

    @Test
    public void testTurnUpwards() {
        assertEquals("U",chandrayan.turnUpwards());
    }

    @Test
    public void testTurnDownwards() {
        assertEquals("D", chandrayan.turnDownwards());
    }

    @Test
    public void testTurnLeft() {
        assertEquals("W",chandrayan.turnLeft());
    }

    @Test
    public void testTurnRight() {
        assertEquals("E",chandrayan.turnRight());
    }

    @Test
    public void testMoveForward(){
        Position pOld = new Position(0,0,0);
        Position pNew = new Position(0,1,0);
        chandrayan.setPosition(pOld);
        chandrayan.setDirection("N");
        assertEquals(pNew,chandrayan.moveForward());
    }

    @Test
    public void testMoveBackward(){
        Position pOld = new Position(0,0,0);
        Position pNew = new Position(-1,0,0);
        chandrayan.setPosition(pOld);
        chandrayan.setDirection("E");
        assertEquals(pNew,chandrayan.moveBackward());
    }


}
