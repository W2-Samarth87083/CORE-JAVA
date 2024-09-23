/* **************
Author:Samarth Zadbuke
Question:3. Write a Java program to find the longest word in a text file. 
/* */

package ASS10.Q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWordInFile {
    public static void main(String[] args) {
        String path = "path/to/your/textfile.txt"; 
        String longestWord = "";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            System.out.println("Longest word: " + longestWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
