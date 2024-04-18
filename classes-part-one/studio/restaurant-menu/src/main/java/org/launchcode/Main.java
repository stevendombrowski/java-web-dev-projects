package org.launchcode;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter what you would like to view:\n" +
                    "0 : All items\n" +
                    "1 : Appetizers\n" +
                    "2 : Main Entrees\n" +
                    "3 : Desserts");
            int answer = input.nextInt();
            if(answer == 0){
                System.out.println("test");
            } else if (answer == 1){
                System.out.println("Appetizers");
            } else if (answer == 2) {
                System.out.println("Entrees");
            } else if (answer == 3) {
                System.out.println("Desserts");
            }
        }
    }

