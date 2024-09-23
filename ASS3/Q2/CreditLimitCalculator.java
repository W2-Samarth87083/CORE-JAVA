package ASS3.Q2;

import java.util.Scanner;

/**
 * 
 * Author:Samarth Zadbuke
 * Question:2. (Credit Limit Calculator)
 * Develop a Java application that determines whether any of several
 * department-store customers has exceeded the credit limit on a
 * charge account.
 * For each customer,the following facts are available:
 * a) account number
 * b) balance at the beginning of the month
 * c) total of all items charged by the customer this month
 * d) total of all credits applied to the customer’s account this
 * month
 * e) allowed credit limit.
 * The program should input all these facts as integers, calculate
 * the new balance (= beginning balance+ charges – credits),
 * display the new balance and determine whether the new balance
 * exceeds the customer’s credit limit. For those customers whose
 * credit limit is exceeded, the program should display
 * the message "Credit limit exceeded".
 * /*
 */
 
public class CreditLimitCalculator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("Enter account number (or -1 to quit): ");
        int accountNumber = sc.nextInt();
        if (accountNumber == -1) {
            break;
        }
        System.out.println("Enter balance at the beginning of the month: ");
        int balance = sc.nextInt();

        System.out.println("Enter total of all items charged this month: ");
        int totalcharge = sc.nextInt();

        System.out.print("Enter total of all credits applied this month: ");
        int totalCredits = sc.nextInt();

        System.out.print("Enter allowed credit limit: ");
        int creditLimit = sc.nextInt();

        int newBalance = balance + totalcharge - totalCredits;

        System.out.println("New balance for account " + accountNumber + " is: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded for account " + accountNumber);
        }

        System.out.println(); // Print a blank line for better readability
    }
        sc.close();
    }
}
    
