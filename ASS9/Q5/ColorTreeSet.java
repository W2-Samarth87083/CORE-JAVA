
/* **************
Author:Samarth Zadbuke
Question:5. Write a program to create various Lists using Collection Framework. 
Define a method to Find max number from ANY List of any numbers.  
/* */
package ASS9.Q5;

import java.util.TreeSet;

public class ColorTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        
        System.out.println("Sorted colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}