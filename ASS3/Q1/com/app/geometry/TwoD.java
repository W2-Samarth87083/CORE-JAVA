



package com.app.geometry;
import java.lang.Math;
public class TwoD {
    private float x;
    private float y;
    
    public TwoD(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String getDetais() {
        return "Point(" + x + ", " + y + ")";

    }

    float getX() {
      
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
    
    public boolean isEquals(TwoD otherTwoD) {
        if (otherTwoD == null) {
            return false;
        } 
            return this.x == otherTwoD.getX() && this.y == otherTwoD.getY();
    }
    
    public float calculateDistance(TwoD otherTwoD) {
        if (otherTwoD == null) {
            throw new IllegalArgumentException("Point cannot be null");  
         }
         return (float) Math.sqrt(Math.pow((otherTwoD.getX() - this.x), 2) + Math.pow((otherTwoD.getY() - this.y), 2));
    }
    
    // public static void main(String[] args) {
    //     TwoD p = new TwoD(1, 2);
    //     TwoD p1 = new TwoD(1, 2);
    //     TwoD p2 = new TwoD(4, 6);

    //     System.out.println(p.isEquals(p1));
    //     System.out.println(p.isEquals(p2));


    //     System.out.println(p.getDetais());
    //     System.out.println(p.calculateDistance(p2));

    // }
 
}
