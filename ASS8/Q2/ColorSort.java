
/* **************
Author:Samarth Zadbuke
Question:2. Write a Java program to create a new array list, add some colors (string) 
and print out the collection as sorted list.
/* */
package ASS8.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorSort {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        Collections.sort(colors);

        for (String color : colors) {
            System.out.println(color);
        }
    }
}