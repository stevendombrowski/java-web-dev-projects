package org.launchcode;
import java.time.LocalDate;
public class MenuItem {
    private String dish;
    private double price;
    private String description;
    private String category;

    private LocalDate date;
    public MenuItem(String dish, double price, String description, String category){
        this.dish = dish;
        this.price = price;
        this.description = description;
        this.category = category;
        this.date = LocalDate.now();
    }
    public void setDish(String dish){
        this.dish = dish;
    }
    public String getDish(){
        return dish;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }
    public LocalDate getDate(){
        return date;
    }
}


