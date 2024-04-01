package org.launchcode;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit; //Declares that fahrenheit is of the double data type
        double celsius; //Declares that celsius is of the double data type
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
