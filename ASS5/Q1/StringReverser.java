


/* **************
Author:Samarth Zadbuke
Question:1. Write a java program to reverse a String
/* */
package ASS5.Q1;

public class StringReverser {
    public static void main(String[] args) {
        String inputString = "Hello, world!";

        String reversedString = reverseString(inputString);

        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String inputString) {
        StringBuilder reversed = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }
        return reversed.toString();
    }
}
