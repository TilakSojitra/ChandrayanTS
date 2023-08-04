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
        chandrayan.setDirection("U");
        String curDir = chandrayan.getDirection();

        if(curDir.equals("N") || curDir.equals("U") || curDir.equals("D")) assertEquals("W",chandrayan.turnLeft());
        if(curDir.equals("E")) assertEquals("N",chandrayan.turnLeft());
        if(curDir.equals("S")) assertEquals("E",chandrayan.turnLeft());
        if(curDir.equals("W")) assertEquals("S",chandrayan.turnLeft());
    }

    @Test
    public void testTurnRight() {
        chandrayan.setDirection("U");
        String curDir = chandrayan.getDirection();

        if(curDir.equals("N") || curDir.equals("U") || curDir.equals("D")) assertEquals("E",chandrayan.turnRight());
        if(curDir.equals("W")) assertEquals("N",chandrayan.turnRight());
        if(curDir.equals("E")) assertEquals("S",chandrayan.turnRight());
        if(curDir.equals("S")) assertEquals("W",chandrayan.turnRight());
    }

    @Test
    public void testMoveForward(){

        chandrayan.setDirection("U");
        String curDir = chandrayan.getDirection();
        Position pOld = new Position(0,-3,4);
        chandrayan.setPosition(pOld);

        if(curDir.equals("N")){
            Position pNew = new Position(pOld.getX(), pOld.getY()+1, pOld.getZ() );
            assertEquals(pNew,chandrayan.moveForward());
        }
        else if(curDir.equals("E")){
            Position pNew = new Position(pOld.getX()+1, pOld.getY(), pOld.getZ() );
            assertEquals(pNew,chandrayan.moveForward());
        }
        else if(curDir.equals("U")){
            Position pNew = new Position(pOld.getX(), pOld.getY(), pOld.getZ()+1);
            assertEquals(pNew,chandrayan.moveForward());
        }
        else if(curDir.equals("S")){
            Position pNew = new Position(pOld.getX(), pOld.getY()-1, pOld.getZ());
            assertEquals(pNew,chandrayan.moveForward());
        }
        else if(curDir.equals("W")){
            Position pNew = new Position(pOld.getX()-1, pOld.getY(), pOld.getZ());
            assertEquals(pNew,chandrayan.moveForward());
        }
        else if(curDir.equals("D")){
            Position pNew = new Position(pOld.getX(), pOld.getY(), pOld.getZ()-1);
            assertEquals(pNew,chandrayan.moveForward());
        }
    }

    @Test
    public void testMoveBackward(){
        chandrayan.setDirection("U");
        String curDir = chandrayan.getDirection();
        Position pOld = new Position(0,-3,4);
        chandrayan.setPosition(pOld);

        if(curDir.equals("N")){
            Position pNew = new Position(pOld.getX(), pOld.getY()-1, pOld.getZ() );
            assertEquals(pNew,chandrayan.moveBackward());
        }
        else if(curDir.equals("E")){
            Position pNew = new Position(pOld.getX()-1, pOld.getY(), pOld.getZ() );
            assertEquals(pNew,chandrayan.moveBackward());
        }
        else if(curDir.equals("U")){
            Position pNew = new Position(pOld.getX(), pOld.getY(), pOld.getZ()-1);
            assertEquals(pNew,chandrayan.moveBackward());
        }
        else if(curDir.equals("S")){
            Position pNew = new Position(pOld.getX(), pOld.getY()+1, pOld.getZ());
            assertEquals(pNew,chandrayan.moveBackward());
        }
        else if(curDir.equals("W")){
            Position pNew = new Position(pOld.getX()+1, pOld.getY(), pOld.getZ());
            assertEquals(pNew,chandrayan.moveBackward());
        }
        else if(curDir.equals("D")){
            Position pNew = new Position(pOld.getX(), pOld.getY(), pOld.getZ()+1);
            assertEquals(pNew,chandrayan.moveBackward());
        }
    }
}
