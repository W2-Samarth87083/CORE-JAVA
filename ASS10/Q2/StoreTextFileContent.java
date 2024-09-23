/* **************
Author:Samarth Zadbuke
Question:2.  Write a Java program to store text file content line by line into an array
**********************
/* */


package ASS10.Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StoreTextFileContent {
    public static void main(String[] args) {
        String path = "path/to/your/textfile.txt"; 
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
            String[] linesArray = content.toString().split("\n");
            for (String str : linesArray) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
