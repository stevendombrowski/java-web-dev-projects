package org.launchcode;

import java.util.Scanner;
public class Gas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Miles Traveled: ");
        Double miles = input.nextDouble();
        System.out.println("Enter Amount of Gallons of Gas Consumed: ");
        Double gas = input.nextDouble();
        System.out.println("You are running on " + miles / gas + "mpg.");
    }
}
