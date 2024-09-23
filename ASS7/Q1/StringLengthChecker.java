

/* **************
Author:Samarth Zadbuke
Question:1.   Define a new exception, called ExceptionLineTooLong, that prints out the error message "The 
strings is too long". Write a program that reads a String from user and calculates its length.  and throws 
an exception of type ExceptionLineTooLong in the case where a string of length is more than 80 
characters. 
/* */



package ASS7.Q1;

public class StringLengthChecker {
    public static void checkStringLength(String input) throws ExceptionLineTooLong {
        if (input.length() > 80) {
            throw new ExceptionLineTooLong("The string is too long");
        } else {
            System.out.println("String length is acceptable: " + input.length() + " characters.");
        }
    }

    public static void main(String[] args) {
       
        String testString = "This is a long string that contains more than eighty characters to test the exception handling mechanism.";

        try {
            checkStringLength(testString);
        } catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        }
    }
}
