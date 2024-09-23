/* **************
Author:Samarth Zadbuke
Question:2.   Build a new Circle class with the following basic features: 
 Attributes: 
o Center point - Build instance variables for the circle’s center point 
(myX and myY represented as double values). 
o Diameter - Build an instance variable for the circle’s diameter (myDiameter also 
represented as a double value). 
 Behaviors 
o Default constructor - Build a default constructor that initializes the circle’s center 
point to (0, 0) and its diameter to 100. 
o Accessor methods - Build accessor methods for the two center coordinates and the 
diameter. 
 Invariant 
o The circle’s diameter should always be non-negative. maintain the integrity of each 
circle object by ensuring that the class invariant (that the diameter should be non
negative) is true at all times. 
If the diameter is negative then throw user defined exception. 
/* */

package ASS7.Q2;

public class Circle {
    
    private double myX;
    private double myY;
    private double myDiameter;

    public Circle() {
        this.myX = 0;
        this.myY = 0;
        this.myDiameter = 100;
    }
    public Circle(double x, double y, double diameter) throws NegativeDiameterException {
        this.myX = x;
        this.myY = y;
        setDiameter(diameter); 
    }
    public double getX() {
        return myX;
    }

    public double getY() {
        return myY;
    }

    public double getDiameter() {
        return myDiameter;
    }
    public void setDiameter(double diameter) throws NegativeDiameterException {
        if (diameter < 0) {
            throw new NegativeDiameterException("Diameter cannot be negative.");
        }
        this.myDiameter = diameter;
    }
    public String getDetails() {
        return "Center: (" + myX + ", " + myY + "), Diameter: " + myDiameter;
    }
    public static void main(String[] args) {
        try {
         
            Circle defaultCircle = new Circle();
            System.out.println("Default Circle: " + defaultCircle.getDetails());

            Circle customCircle = new Circle(5, 5, 50);
            System.out.println("Custom Circle: " + customCircle.getDetails());

            Circle invalidCircle = new Circle(3, 3, -20); 
        } catch (NegativeDiameterException e) {
            System.out.println(e.getMessage());
        }
    }
}
