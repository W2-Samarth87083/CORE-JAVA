



/* **************
Author:Samarth Zadbuke
Question:1. Store book details in a library in hashing based data structure : HashSet 
Book details : 
isbn(string),category(enum),price(double),publishDate,authorName(string),q
 uantity(int) 
Unique ID : isbn 
Accept at least 5 book details from user & display.  
/* */

package ASS9.Q1;

import java.time.LocalDate;
import java.util.Locale.Category;

public class Book {
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getQuantity() {
        return quantity;
    }

    private String isbn;
    private Category category;
    private double price;
    private LocalDate publishDate;
    private String authorName;
    private int quantity;

    public Book(String isbn, Category category, double price, LocalDate publishDate, String authorName, int quantity) {
        this.isbn = isbn;
        this.category = category;
        this.price = price;
        this.publishDate = publishDate;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return isbn.equals(other.isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", publishDate=" + publishDate +
                ", authorName='" + authorName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}