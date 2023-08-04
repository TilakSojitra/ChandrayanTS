package org.chandrayan.ts;

public class Chandrayan {

    private Position position;
    private String direction;

    public Chandrayan() {
    }

    public Chandrayan(Position position, String direction) {
        this.position = position;
        this.direction = direction;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String turnUpwards(){ return null;}

    public String turnDownwards(){ return null;}

    public String turnLeft(){ return null;}

    public String turnRight(){ return null;}

    public Position moveForward() { return null; }

    public Position moveBackward() { return null; }
}
