

/* **************
Author:Samarth Zadbuke
Question:4.Write a java program to find whether  the  file is Hidden file or not inside 
the directory.  
/* */
package ASS10.Q4;

import java.io.File;

public class CheckHiddenFile {
    public static void main(String[] args) {
        String path = "path/to/your/file"; 
        File file = new File(path);

        if (file.isHidden()) {
            System.out.println(file.getName() + " is a hidden file.");
        } else {
            System.out.println(file.getName() + " is not a hidden file.");
        }
    }
}
