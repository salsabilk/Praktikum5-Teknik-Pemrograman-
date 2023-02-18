package w5.shape;

/**
 * <h1>Kasus 2</h1>
 * Program  : Square.java  
 * NIM      : 221524058
 * Nama     : Salsabil Khoirunisa
 * Versi    : 1.0
 * Tanggal  : 14 Februari 2023
 */

public class Square extends Rectangle{
    public Square() {                   // 1st Constructor tanpa parameter
        super();
    }
    
    public Square(double side){         // 2nd Constructor dengan satu parameter
        //Memanggil constructor superclass Rectangle dengan parameter side dan side
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {    // 3rd Constructor dengan tiga parameter
        super(side, side, color, filled);
    }
    
    // Method getter
    public double getSide() {
        return super.getWidth();
    }
    
    // Method setter
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public double getArea() {       // Method getArea()
        return getSide()*getSide();
    }
    
    @Override
    public double getPerimeter() {      // Method getPerimeter()
        return 4*getSide();
    }
    
    @Override
    public void setLength(double side) {    // Method setLength() akan mengatur panjang Rectangle dengan panjang sisi yang sama
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setWidth(double side){    // Method setWidth() akan mengatur lebar Rectangle dengan panjang sisi yang sama
        super.setWidth(side);
        super.setLength(side);
    }
    
    // Method toString() akan mengembalikan representasi String dari objek Square
    @Override
    public String toString(){
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}
