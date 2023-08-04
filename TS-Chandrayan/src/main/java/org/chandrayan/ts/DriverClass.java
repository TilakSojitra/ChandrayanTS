package org.chandrayan.ts;

import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Initial Direction of Chandrayan:- ");
        String dir = sc.next();

        sc.nextLine();

        System.out.println("Enter Initial Position of Chandrayan in three space separated Integer:- ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        Position initialPosition = new Position(x,y,z);
        Chandrayan chandrayan = new Chandrayan(initialPosition,dir);

        int num_of_op;
        System.out.println("Enter number of operation:- ");
        num_of_op = sc.nextInt();

        String operation;
        while(num_of_op != 0){
            System.out.print("Enter operation:- ");
            operation = sc.next();

            switch(operation){
                case "f":
                    chandrayan.moveForward();
                    break;
                case "r":
                    chandrayan.turnRight();
                    break;
                case "u":
                    chandrayan.turnUpwards();
                    break;
                case "b":
                    chandrayan.moveBackward();
                    break;
                case "l":
                    chandrayan.turnLeft();
                    break;
                case "d":
                    chandrayan.turnDownwards();
                    break;
                default:
                    System.out.println("Invalid Operation");
                    num_of_op++;
                    break;
            }
            num_of_op--;
        }

        System.out.print("Final Position after performing all operation:- " + chandrayan.getPosition());
        System.out.print("\nFinal direction of chandrayan after performing all operation:- " + chandrayan.getDirection());
    }
}