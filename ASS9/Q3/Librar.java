

/* **************
Author:Samarth Zadbuke
Question:3.  Sort the book details as per publish date and display it. 
/* */
package ASS9.Q3;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import ASS9.Q1.Book;
public class Librar {
    public static void main(String[] args) {

        TreeSet<Book> sortedBooks = new TreeSet<>(Comparator.comparing(Book::getPublishDate));
        Collection<? extends Book> books;
        sortedBooks.addAll(books);

        System.out.println("\nBook Details (Sorted by Publish Date):");
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }
}


