package w5.circle;

/**
 * <h1>Kasus 1</h1>
 * Program  : Circle.java  
 * NIM      : 221524058
 * Nama     : Salsabil Khoirunisa
 * Versi    : 1.0
 * Tanggal  : 14 Februari 2023
 */

public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;
    
    // Constructor (overloaded)
    /* Constructs  a Circle instacnce with default value for radius*/
    public Circle(){    // 1st(default) constructor
        radius = 1.0;
        color = "red";
    }
    
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }
    
    public Circle(double r, String color) { // 3rd constructor
        radius = r;
        this.color = color;
    }
    
    /** Returns the radius */
    public double getRadius() {         
        return radius;                      // Mengembalikan nilai dari radius lingkaran.
    }
    
    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;       // Menghitung dan mengembalikan nilai luas lingkaran berdasarkan rumus πr^2.
    }
    
    /** Returns the color */
    public String getColor() {
        return color;                       // Mengembalikan nilai warna lingkaran.
    }
    
    /** Setter color */
    public void setColor() {
        this.color = color;
    }
    
    /** Return a self-descriptive string of this instance in the form of 
    Circle[radius=?,color=?] */
    @Override
    public String toString() {
        return "Circle[radius = " + radius + " color = " + color + "]";
    }

}
