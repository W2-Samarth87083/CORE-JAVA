
import java.lang.Math;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "Point(" + x + ", " + y + ")";

    }

    private float getX() {

        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public boolean isEquals(Point2D otherTwoD) {
        if (otherTwoD == null) {
            return false;
        }
        return this.x == otherTwoD.getX() && this.y == otherTwoD.getY();
    }

    public float calculateDistance(Point2D otherTwoD) {
        if (otherTwoD == null) {
            throw new IllegalArgumentException("Point cannot be null");
        }
        return (float) Math.sqrt(Math.pow((otherTwoD.getX() - this.x), 2) + Math.pow((otherTwoD.getY() - this.y), 2));
    }

    // public static void main(String[] args) {
    // TwoD p = new TwoD(1, 2);
    // TwoD p1 = new TwoD(1, 2);
    // TwoD p2 = new TwoD(4, 6);

    // System.out.println(p.isEquals(p1));
    // System.out.println(p.isEquals(p2));

    // System.out.println(p.getDetais());
    // System.out.println(p.calculateDistance(p2));

    // }

}

// import java.util.Scanner;

// public class TestPoint1 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// // Accept coordinates for the first point (p1)
// System.out.print("Enter x and y coordinates for Point 1: ");
// float x1 = sc.nextFloat();
// float y1 = sc.nextFloat(); // Accept coordinates for the second point (p2)
// System.out.print("Enter x and y coordinates for Point 2: ");
// float x2 = sc.nextFloat();
// float y2 = sc.nextFloat();

// TwoD p1 = new TwoD(x1, y1);
// TwoD p2 = new TwoD(x2, y2);

// System.out.println(p1.getDetais());

// if (p1.isEquals(p2)) {
// System.out.println("Point 1 and Point 2 are located at the same position.");
// } else {
// System.out.println("Point 1 and Point 2 are located at different
// positions.");
// // If the points are different, calculate and display the distance between
// them
// System.out.println("Distance between Point 1 and Point 2: " +
// p1.calculateDistance(p2));
// }
// sc.close();
// }

// }