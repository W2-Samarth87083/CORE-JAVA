

/* **************
Author:Samarth Zadbuke
Question:2. 2. Accept 2 double values from User (using Scanner). Check data type. If 
arguments are not doubles, supply suitable error message & terminate. 
If numbers are double values, print its average. 
/* */



import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("_____Numbers Double Data Type Checker AND Average Of Double number_____");
        System.out.println("Enter the 1st Double Number:");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Please enter a valid double value.");
            return;
        }
        double num1 = sc.nextDouble();
        System.out.println("Enter the 2st Double Number:");
        if (!sc.hasNextDouble()) {
            System.err.println("Error: Please enter a valid double value.");
            return;
        }
        double num2 = sc.nextDouble();

        double Average = (num1 + num2)/2;
        System.out.println(Average);
        
       
    }
}