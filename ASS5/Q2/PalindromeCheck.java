



/* **************
Author:Samarth Zadbuke
Question:2. Write a java code to check string is palindrome. 
/* */

package ASS5.Q2;

public class PalindromeCheck {
    public static void main(String[] args) {
       
        String originalString = "madam";
    
        boolean isPalindrome = true;
        int length = originalString.length();
        for (int i = 0; i < length / 2; i++) {
            if (originalString.charAt(i) != originalString.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }
    }
}
