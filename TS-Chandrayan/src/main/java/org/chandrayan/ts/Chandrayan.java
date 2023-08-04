package org.chandrayan.ts;

import java.util.Objects;

public class Chandrayan {

    private Position position;
    private String direction;

    public Chandrayan() {
    }

    public Chandrayan(String direction) {
        this.direction = direction;
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

    @Override
    public String toString() {
        return "Chandrayan{" +
                "position=" + position +
                ", direction='" + direction + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chandrayan that = (Chandrayan) o;
        return Objects.equals(position, that.position) && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, direction);
    }

    public String turnUpwards(){
//        this.setDirection("U");
        return this.direction;
    }

    public String turnDownwards(){ return "D";}

    public String turnLeft(){ return "W";}

    public String turnRight(){ return "E";}

    public Position moveForward() {
        this.position.setY(this.position.getY()+1);
        return this.position;
    }

    public Position moveBackward() {
        this.position.setX(this.position.getX()-1);
        return this.position;
    }
}
