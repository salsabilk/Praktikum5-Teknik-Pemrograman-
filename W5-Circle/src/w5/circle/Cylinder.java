package w5.circle;

/**
 * <h1>Kasus 1</h1>
 * Program  : Cylinder.java  
 * NIM      : 221524058
 * Nama     : Salsabil Khoirunisa
 * Versi    : 1.0
 * Tanggal  : 14 Februari 2023
 */

public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height;      // private variabel
    
    // Constructor with default color, radius and height
    public Cylinder(){
        super(); // call superclass no-arg constructor Circle()
        height = 1.0; 
    }
    
    // Constructor with default radius, color but given height
    public Cylinder(double height){
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }
    
    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass no-arg constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;                  // Mengembalikan nilai dari tinggi silinder
    }
    
    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
        return super.getArea()*height;  // Menghitung dan mengembalikan nilai volume silinder berdasarkan rumus luas alas kali tinggi.
                                        /* Pada method getVolume, luas alas dihitung menggunakan method "getArea" 
                                           dari superclass "Circle". */
    }
    
    @Override
    public double getArea(){
        return 2*super.getArea() + 2*Math.PI*super.getRadius()*getHeight();
        /* Method "getArea" di-override dalam class "Cylinder" untuk menghitung dan mengembalikan nilai luas permukaan 
           silinder berdasarkan rumus 2πr^2 + 2πrh. */
    }
    
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
        + " height=" + height;
    }

}
