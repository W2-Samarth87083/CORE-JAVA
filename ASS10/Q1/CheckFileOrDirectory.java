/* **************
Author:Samarth Zadbuke
Question:1.  Write a Java program to check if a file or directory specified by pathname 
exists or no. 
**********************//* */



package ASS10.Q1;

import java.io.File;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        String path = "path/to/your/file_or_directory"; 
        File file = new File(path);

        if (file.exists()) {
            System.out.println(file.getName() + " exists.");
        } else {
            System.out.println(file.getName() + " does not exist.");
        }
    }
}
