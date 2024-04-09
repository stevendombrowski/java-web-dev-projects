package org.launchcode;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem pasta = new MenuItem("Pasta", 12.99, "Pasta shells", "main course");
        System.out.println(pasta.getDate());
    }
}
