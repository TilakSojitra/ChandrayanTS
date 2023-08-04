package org.chandrayan.ts;

import org.junit.Test;

import java.sql.Driver;

import static org.junit.Assert.assertEquals;

public class DriverClassTest {

    private Chandrayan chandrayan = new Chandrayan();

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
        chandrayan.setDirection("W");
        String curDir = chandrayan.getDirection();

        if(curDir.equals("N") || curDir.equals("U") || curDir.equals("D")) assertEquals("W",chandrayan.turnLeft());
        if(curDir.equals("E")) assertEquals("N",chandrayan.turnLeft());
        if(curDir.equals("S")) assertEquals("E",chandrayan.turnLeft());
        if(curDir.equals("W")) assertEquals("S",chandrayan.turnLeft());
    }

    @Test
    public void testTurnRight() {
        chandrayan.setDirection("W");
        String curDir = chandrayan.getDirection();

        if(curDir.equals("N") || curDir.equals("U") || curDir.equals("D")) assertEquals("E",chandrayan.turnRight());
        if(curDir.equals("W")) assertEquals("N",chandrayan.turnRight());
        if(curDir.equals("E")) assertEquals("S",chandrayan.turnRight());
        if(curDir.equals("S")) assertEquals("W",chandrayan.turnRight());
    }

    @Test
    public void testMoveForward(){
        Position pOld = chandrayan.getPosition();
        Position pNew = new Position(0,1,0);

        assertEquals(pNew,chandrayan.moveForward());
    }

    @Test
    public void testMoveBackward(){
        Position pOld = chandrayan.getPosition();
        Position pNew = new Position(-1,0,0);

        assertEquals(pNew,chandrayan.moveBackward());
    }
}
