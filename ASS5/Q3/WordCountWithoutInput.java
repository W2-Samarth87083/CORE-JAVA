



/* **************
Author:Samarth Zadbuke
Question:3.Write a java code to check string is palindrome. 
/* */package ASS5.Q3;

public class WordCountWithoutInput {
    public static void main(String[] args) {
      
        String input = "This is an example of a string with multiple words";
        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
    }
}
