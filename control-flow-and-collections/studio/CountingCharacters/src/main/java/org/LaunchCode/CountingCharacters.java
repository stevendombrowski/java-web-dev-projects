package org.LaunchCode;
import java.util.Scanner;
import java.util.HashMap;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("C:\\Users\\Steven\\Downloads\\string.txt");
        String msg = Files.readString(fileName);

        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> sentence = new HashMap<>();
        System.out.println("Enter your word or sentence here: ");
//        String msg = input.nextLine();
        String caseInsensitive = msg.toLowerCase();

        for (char letter : caseInsensitive.toCharArray()){
            if (sentence.containsKey(letter)){
                sentence.put(letter, sentence.get(letter) + 1);
            }
            else{ sentence.put(letter, 1) ;}
        }
    for (char letter : sentence.keySet()){
        System.out.println(letter + " : "+ sentence.get(letter));
    }
    }
}
