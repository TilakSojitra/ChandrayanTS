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
        chandrayan.setDirection("E");
        assertEquals("N",chandrayan.turnLeft());
        chandrayan.setDirection("S");
        assertEquals("E",chandrayan.turnLeft());
        chandrayan.setDirection("W");
        assertEquals("S",chandrayan.turnLeft());
        chandrayan.setDirection("U");
        assertEquals("W",chandrayan.turnLeft());
    }

    @Test
    public void testTurnRight() {
        chandrayan.setDirection("W");
        assertEquals("N",chandrayan.turnRight());
        chandrayan.setDirection("E");
        assertEquals("S",chandrayan.turnRight());
        chandrayan.setDirection("S");
        assertEquals("W",chandrayan.turnRight());
        chandrayan.setDirection("U");
        assertEquals("E",chandrayan.turnRight());
    }

    @Test
    public void testMoveForward(){
        Position pOld = new Position(0,-3,4);
        chandrayan.setPosition(pOld);
        chandrayan.setDirection("N");
        assertEquals(new Position(pOld.getX(), pOld.getY()+1, pOld.getZ() ),chandrayan.moveForward());
        chandrayan.setDirection("E");
        assertEquals(new Position(pOld.getX()+1, pOld.getY(), pOld.getZ() ),chandrayan.moveForward());
        chandrayan.setDirection("U");
        assertEquals(new Position(pOld.getX(), pOld.getY(), pOld.getZ()+1),chandrayan.moveForward());
        chandrayan.setDirection("S");
        assertEquals(new Position(pOld.getX(), pOld.getY()-1, pOld.getZ()),chandrayan.moveForward());
        chandrayan.setDirection("W");
        assertEquals(new Position(pOld.getX()-1, pOld.getY(), pOld.getZ()),chandrayan.moveForward());
        chandrayan.setDirection("D");
        assertEquals(new Position(pOld.getX(), pOld.getY(), pOld.getZ()-1),chandrayan.moveForward());
    }

    @Test
    public void testMoveBackward(){
        Position pOld = new Position(0,-3,4);
        chandrayan.setPosition(pOld);
        chandrayan.setDirection("N");
        assertEquals(new Position(pOld.getX(), pOld.getY()-1, pOld.getZ() ),chandrayan.moveBackward());
        chandrayan.setDirection("E");
        assertEquals(new Position(pOld.getX()-1, pOld.getY(), pOld.getZ() ),chandrayan.moveBackward());
        chandrayan.setDirection("U");
        assertEquals(new Position(pOld.getX(), pOld.getY(), pOld.getZ()-1),chandrayan.moveBackward());
        chandrayan.setDirection("S");
        assertEquals(new Position(pOld.getX(), pOld.getY()+1, pOld.getZ()),chandrayan.moveBackward());
        chandrayan.setDirection("W");
        assertEquals(new Position(pOld.getX()+1, pOld.getY(), pOld.getZ()),chandrayan.moveBackward());
        chandrayan.setDirection("D");
        assertEquals(new Position(pOld.getX(), pOld.getY(), pOld.getZ()+1),chandrayan.moveBackward());
    }
}
