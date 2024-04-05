package org.LaunchCode;

import java.util.Arrays;

public class Collections {
    public static void main(String[] args){
        String msg = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        int[] array = {1, 1, 2, 3, 5, 8};
        for (int number : array){
            System.out.println(number);
        }
        for (int number : array){
            if(number % 2 == 1){
                System.out.println(number);
            }
        }
        String[] splitMsg = msg.split(" ");
        System.out.println(Arrays.toString(splitMsg));
    }
}
