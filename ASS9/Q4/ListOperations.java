

/* **************
Author:Samarth Zadbuke
Question:4.   Write a program to create various Lists using Collection Framework. 
Define a method to Find max number from ANY List of any numbers.  
/* */
package ASS9.Q4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
   
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(20);

        linkedList.add(30);
        linkedList.add(15);
        linkedList.add(25);
        int maxInArrayList = findMax(arrayList);
        int maxInLinkedList = findMax(linkedList);

        System.out.println("Maximum in ArrayList: " + maxInArrayList);
        System.out.println("Maximum in LinkedList: " + maxInLinkedList);
    }

    public static <T extends Comparable<T>> T findMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty.");
        }

        T max = list.get(0);
        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}