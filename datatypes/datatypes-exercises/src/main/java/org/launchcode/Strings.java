package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        String ciSentence = sentence.toLowerCase();
        System.out.print("Please enter your search term here: ");
        String search = input.nextLine();
        String ciSearch = search.toLowerCase();
        int index = ciSentence.indexOf(ciSearch);
        int length = ciSearch.length();
        String modifiedString = sentence.replace(search, "");
        System.out.print(ciSentence.contains(ciSearch));
        System.out.print("Index of search term: " + index + ". Your term is " + length + " Characters long.");
        System.out.println(modifiedString);

    }
}
