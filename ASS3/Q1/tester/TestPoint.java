/* **************
Author:Samarth Zadbuke
Question:1. Create a class Point2D , in package - "com.app.geometry"   : for representing 
a point in x-y co-ordinate system. Create a parameterized constructor to init 
x & y co-ords. Add a method to return string form of  point's x & y co-ords  
Hint :  public String getDetails())  
Add isEqual method to Point2D class :a boolean returning method : must 
return true if n only if both points are having same x,y co-ords or false 
otherwise. 
Add calculateDistance method to calculate distance between current point 
and specified point & return the distance to the caller. 
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow 
etc. 
Write TestPoint class , in package "tester" , with a main method, Accept co 
ordinates of 2 points from user (Scanner) --to create 2 points (p1 & p2) 
Use getDetails method to display point details.(p1's details & p2's details) 
Invoke isEqual & display if points are same or different (i.e p1 & p2 are located 
at the same position) 
If they are not located at the same position , display distance between p1 & 
p2*/

package tester;

import java.util.Scanner;

import com.app.geometry.TwoD;

public class TestPoint {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter x and y coordinates for Point 1: ");
    float x1 = sc.nextFloat();
    float y1 = sc.nextFloat();   
    System.out.print("Enter x and y coordinates for Point 2: ");
    float x2 = sc.nextFloat();
    float y2 = sc.nextFloat();

    TwoD p1 = new TwoD(x1, y1);
    TwoD p2 = new TwoD(x2, y2);

    System.out.println(p1.getDetais());

        if (p1.isEquals(p2)) {
            System.out.println("Point 1 and Point 2 are located at the same position.");
        }
        else {
            System.out.println("Point 1 and Point 2 are located at different positions.");
            System.out.println("Distance between Point 1 and Point 2: " + p1.calculateDistance(p2));
        }
        sc.close(); 
}

}