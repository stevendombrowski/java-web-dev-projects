package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length Value: ");
        int length = input.nextInt();
        System.out.println("Enter Width Value: ");
        int width = input.nextInt();
        System.out.println(length * width);
    }
}
