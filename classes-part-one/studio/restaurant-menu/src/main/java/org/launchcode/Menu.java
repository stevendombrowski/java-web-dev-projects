package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();


    public Menu(){

    }
    public void addMenuItems(MenuItem item){
        item.setDate(LocalDate.now());
        menuItems.add(item);

    }
    public void printMenu(){
        for (MenuItem item : menuItems){
            System.out.println("Dish: " + item.getDish());
            System.out.println("Price: " + item.getPrice());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Date entered: " + item.getDate());
            if(LocalDate.now().toEpochDay() - item.getDate().toEpochDay() < 14){
                System.out.println("NEW");
            };
            System.out.println("-----------------------");
        }
    }

    public void printEntree(){

        for (MenuItem item : menuItems){
            if(item.getCategory() == "Main Course"){
                print(item);}
            else if (item.getCategory() == "Appetizer"){
                
                System.out.println("Dish: " + item.getDish());
                System.out.println("Price: " + item.getPrice());
                System.out.println("Description: " + item.getDescription());
                System.out.println("Category: " + item.getCategory());
                System.out.println("-----------------------");

                System.out.println("Dish: " + item.getDish() + "\nPrice: " + item.getPrice());
            }
        }
    }
    private void print(MenuItem  item){
        System.out.println("Dish: " + item.getDish());
        System.out.println("Price: " + item.getPrice());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Category: " + item.getCategory());
        System.out.println("-----------------------");
    }
    public void printAppetizer(){

        for (MenuItem item : menuItems){
            if(item.getCategory() == "Appetizer"){
                System.out.println("Dish: " + item.getDish());
                System.out.println("Price: " + item.getPrice());
                System.out.println("Description: " + item.getDescription());
                System.out.println("Category: " + item.getCategory());
                System.out.println("-----------------------");
            }
        }
    }
    public void printDessert(){

        for (MenuItem item : menuItems){
            if(item.getCategory() == "Dessert"){
                System.out.println("Dish: " + item.getDish());
                System.out.println("Price: " + item.getPrice());
                System.out.println("Description: " + item.getDescription());
                System.out.println("Category: " + item.getCategory());
                System.out.println("-----------------------");
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem pasta = new MenuItem("Pasta", 12.99, "Boiled pasta", "Main Course");
        MenuItem cake = new MenuItem("Cake", 8.99, "Baked pastry", "Dessert");
        MenuItem soup = new MenuItem("Soup", 3.99, "Boiled broth", "Appetizer");
        MenuItem soup2 = new MenuItem("Soup", 3.99, "Boiled broth", "Appetizer");
        menu.addMenuItems(pasta);
        menu.addMenuItems(cake);
        menu.addMenuItems(soup);
        menu.addMenuItems(soup2);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter what you would like to view:\n" +
                "0 : All items\n" +
                "1 : Appetizers\n" +
                "2 : Main Entrees\n" +
                "3 : Desserts");
        int answer = input.nextInt();

        if(answer == 0){
            menu.printMenu();
        }else if(answer == 2){
            menu.printEntree();
        }else if(answer == 1){
            menu.printAppetizer();
        }else if(answer == 3){
            menu.printDessert();
        }
    }



}



//LocalDate dateAdded = item.getDateAdded();
//        return currentDate.minusDays(days).isAfter(dateAdded);
//        return LocalDate.now().toEpochDay() - dateAdded.toEpochDay();


