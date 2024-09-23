/* **************
Author:Samarth Zadbuke
Question:2. Store details from HashSet into LinkedHashSet , to confirm order of 
insertion. 
/* */

package ASS9.Q2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import ASS9.Q1.Book;

public class Library {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();

        LinkedHashSet<Book> linkedBooks = new LinkedHashSet<>(books);

        System.out.println("\nBook Details (Preserving Insertion Order):");
        for (Book book : linkedBooks) {
            System.out.println(book);
        }

        
    }

    
    
}

