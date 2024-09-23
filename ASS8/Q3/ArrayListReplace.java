
/* **************
Author:Samarth Zadbuke
Question:2.  Write a Java program to replace the second element of a ArrayList with 
the specified element.
/* */

package ASS8.Q3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReplace {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        String newElement = "Purple";
        int indexToReplace = 1; 

        if (indexToReplace >= 0 && indexToReplace < colors.size()) {
            colors.set(indexToReplace, newElement);
            System.out.println("Updated list: " + colors);
        } else {
            System.out.println("Invalid index.");
        }
    }
}