package w5.circle;

/**
 * <h1>Kasus 1</h1>
 * Program  : TestCylinder.java  
 * NIM      : 221524058
 * Nama     : Salsabil Khoirunisa
 * Versi    : 1.0
 * Tanggal  : 14 Februari 2023
 */

public class TestCylinder {

    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder : " + " radius = " + c1.getRadius() +  " height = " + c1.getHeight() + 
                " base area = " + c1.getArea() + " volume = " + c1.getVolume());
        System.out.println(c1.toString() + "\n");
        
        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder : " + " radius = " + c2.getRadius() + " height = " + c2.getHeight() + 
                " base area = " + c2.getArea() + " volume = " + c2.getVolume());
        System.out.println(c2.toString() + "\n");
        
         // Declare and allocate a new instance of cylinder
         // specifying radius and height, with default color
         Cylinder c3 = new Cylinder(2.0, 10.0);
         System.out.println("Cylinder : " + " radius = " + c3.getRadius() + " height = " + c3.getHeight() + 
                 " base area = " + c3.getArea() + " volume = " + c3.getVolume());
         System.out.println(c3.toString() + "\n");
    }
    
}
