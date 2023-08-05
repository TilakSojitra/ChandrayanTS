package org.chandrayan.ts;

import java.util.Objects;

public class Chandrayan {

    private Position position;
    private String direction;
//    private int Speed;
//    private int increaseStep;

    public Chandrayan() {
    }

    public Chandrayan(String direction) {
        this.direction = direction;
    }

    public Chandrayan(Position position, String direction) {
        this.position = position;
        this.direction = direction;
//        this.increaseStep = 1;
    }

//    public int getSpeed() {
//        return Speed;
//    }
//
//    public void setSpeed(int speed) {
//        Speed = speed;
//    }

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
        this.setDirection("U");
        return this.direction;
    }

    public String turnDownwards(){
        this.setDirection("D");
        return this.direction;
    }

    public String turnLeft(){
        String curDir = this.getDirection();
        switch(curDir){
            case "W": // If Direction is west then turn towards South.
                this.setDirection("S");
                break;
            case "S": // If Direction is south then turn towards East.
                this.setDirection("E");
                break;
            case "E": // If Direction is East then turn towards North.
                this.setDirection("N");
                break;
            default: // If Direction is up,down or north then turn towards West.
                this.setDirection("W");
                break;
        }
        return this.getDirection();
    }

    public String turnRight(){
        String curDir = this.getDirection();
        switch(curDir){
            case "W": // If Direction is west then turn towards North.
                this.setDirection("N");
                break;
            case "S": // If Direction is south then turn towards West.
                this.setDirection("W");
                break;
            case "E": // If Direction is east then turn towards South
                this.setDirection("S");
                break;
            default: // If Direction is up,down or north then turn towards East.
                this.setDirection("E");
                break;
        }
        return this.getDirection();
    }

//    public

    public Position moveForward() {

        String curDir = this.getDirection();
        switch(curDir){
            case "N": // One Step Forward to North Direction;
//                if(this.getSpeed() >= 10)
//                    this.position.setY(this.position.getY()+2);
//                else
                    this.position.setY(this.position.getY()+1);
//                this.position.setY(this.position.getY()+1);
                break;
            case "E": // One Step Forward to East Direction
                this.position.setX(this.position.getX()+1);
                break;
            case "U": // One Step Forward to Up Direction
                this.position.setZ(this.position.getZ()+1);
                break;
            case "S": // One Step Forward to South Direction
                this.position.setY(this.position.getY()-1);
                break;
            case "W": // One Step Forward to West Direction
                this.position.setX(this.position.getX()-1);
                break;
            case "D": // One Step Forward to Down Direction
                this.position.setZ(this.position.getZ()-1);
                break;
            default:  // Some Error.
                System.out.println("Invalid Operation");
                break;
        }
        return this.position;
    }

    public Position moveBackward() {
        String curDir = this.getDirection();
        switch(curDir){
            case "N": // One Step Backward from North Direction.
                this.position.setY(this.position.getY()-1);
                break;
            case "E": // One Step Backward from East Direction.
                this.position.setX(this.position.getX()-1);
                break;
            case "U": // One Step Backward from Up Direction.
                this.position.setZ(this.position.getZ()-1);
                break;
            case "S": // One Step Backward from South Direction.
                this.position.setY(this.position.getY()+1);
                break;
            case "W": // One Step Backward from West Direction.
                this.position.setX(this.position.getX()+1);
                break;
            case "D": // One Step Backward from Down Direction.
                this.position.setZ(this.position.getZ()+1);
                break;
            default: // Some Error.
                System.out.println("Invalid Operation");
                break;
        }
        return this.position;
    }
}
