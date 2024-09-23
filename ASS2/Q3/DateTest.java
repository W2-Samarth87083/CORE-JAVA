
/* **************
Author:Samarth Zadbuke

Question:1. 3. Create a class called Date that includes three instance variables—a 
month (type int), a day (type int) and a year (type int). Provide a constructor 
that initializes the three instance variables and assumes that the values 
provided are correct. Provide a set and a get method for each instance 
variable. Provide a method displayDate that displays the month, day and 
year separated by forward slashes (/). Write a test application named 
DateTest that demonstrates class Date’s capabilities.

**********************
 */

public class DateTest {
    public static void main(String[] args) {

        // Create a Date object
        Date date1 = new Date(9, 19, 2024);

        // Display the initial date
        System.out.println("Initial date:");
        date1.displayDate();

        // Modify the date using setters
        date1.setMonth(10);
        date1.setDay(25);
        date1.setYear(2023);

        // Display the updated date
        System.out.println("\nUpdated date:");
        date1.displayDate();
    }
}
