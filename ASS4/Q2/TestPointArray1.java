
/* **************
Author:Samarth Zadbuke
Question:2. Copy the  Point2D class , along with the package of Q1.  
a)Create a class "TestPointArray1.java" in "tester" package for the following 
b) Accept , how many no of points to plot from user. 
c) Create suitable data structure 
Hint : Point2D[] points=new Point2D[sc.nextInt()]; 
d) Prompt user for x & y co ordinates n store the data suitably  
Hint : for loop 
e) Supply Menu to user with various Options 
1. Display details of a specific point 
User i/p : index 
O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid 
index , pls retry!!!!) 
2)  Display x, y co-ordinates of all points 
Hint : for-each 
3) User i/p : 2 indices for the points , validate the indices 
Display distance between specified points (iff they are not located at the same 
position) 
eg : sop("Enter index of strt point n end point"); 
validation : boundary condition (0<=index<length-1) 
isEqual -- false --compute distance --display it. 
4. Exit
/* */

// Question:2. = Declare two Arrays of type String. Find the duplicate values of an array 
// of string values. (Hint: use equals()) 

import java.util.Scanner;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of points to plot: ");
        int numberOfPoints = sc.nextInt();
        Point2D[] points = new Point2D[numberOfPoints];

        for (int i = 0; i < numberOfPoints; i++) {
            System.out.println("Enter x and y coordinates for point " + (i + 1) + ": ");
            float x = sc.nextFloat();
            float y = sc.nextFloat();

            points[i] = new Point2D(x, y);
        }
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. Display distance between two points");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the index of the point to display: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < points.length) {
                        System.out.println("Details of Point " + (index + 1) + ": " + points[index].getDetails());
                    } else {
                        System.out.println("Invalid index, please retry!!!!");
                    }
                    break;
                case 2:
                    System.out.println("Details of all points:");
                    for (Point2D point : points) {
                        System.out.println(point.getDetails());
                    }
                case 3:
                    System.out.print("Enter index of start point: ");
                    int startPoint = sc.nextInt();
                    System.out.print("Enter index of end point: ");
                    int endPoint = sc.nextInt();

                    if (startPoint >= 0 && startPoint < points.length && endPoint >= 0 && endPoint < points.length) {
                        if (!points[startPoint].isEquals(points[endPoint])) {
                            float distance = points[startPoint].calculateDistance(points[endPoint]);
                            System.out.println("Distance between Point " + (startPoint + 1) + " and Point "
                                    + (endPoint + 1) + " is: " + distance);
                        } else {
                            System.out.println("The two points are located at the same position.");
                        }
                    } else {
                        System.out.println("Invalid indices, please retry!!!!");
                    }

                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option, please retry!!!!");
            }
            String[] array1 = { "apple", "banana", "orange", "apple", "grape" };
            String[] array2 = { "pear", "banana", "kiwi", "apple", "grape" };
            findDuplicates(array1, array2);
        }
    }

    private static void findDuplicates(String[] array1, String[] array2) {
        boolean[] isDuplicate = new boolean[array1.length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j]) && !isDuplicate[i]) {
                    System.out.println("Duplicate found: " + array1[i]);
                    isDuplicate[i] = true;
                    break;
                }
            }
        }
    }

}
