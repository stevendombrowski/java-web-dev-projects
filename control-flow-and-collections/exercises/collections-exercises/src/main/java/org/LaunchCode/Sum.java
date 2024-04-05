package org.LaunchCode;

import java.util.ArrayList;
public class Sum {
   public static void main(String[] args){
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
    numbers.add(7);
    numbers.add(8);
    numbers.add(9);
    numbers.add(10);

    int sumOfEvenNumbers = sumOfEven(numbers);
    System.out.println("Sum of even numbers: " + sumOfEvenNumbers);

    for (int number : numbers){

    }
   }

   public static int sumOfEven(ArrayList<Integer> list){
       int sum = 0;
       for (int num : list){
           if (num % 2 == 0){
               sum += num;
           }
       }
       return sum;
   };



}
