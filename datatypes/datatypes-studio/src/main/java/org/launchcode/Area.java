package org.launchcode;

import java.util.Scanner;
public class Area {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius here: ");
        double r = 0;
        while(!input.hasNextDouble() || (r = input.nextDouble()) < 1) {

            System.out.println("Enter a Double: ");
            input.next();
        }


//        double area = Math.PI * r * r;
        double area = Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is:" + area);

    }

}
