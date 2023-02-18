package w5employee.case1;

/**
 * <h1>Kasus 3 (Case 1)</h1>
 * Program  : Employee.java  
 * NIM      : 221524058
 * Nama     : Salsabil Khoirunisa
 * Versi    : 1.0
 * Tanggal  : 17 Februari 2023
 */

public class Employee extends Sortable{
    public Employee(String n, double s, int day, int month, int year){	
	name = n;
	salary = s;
	hireday = day;
	hiremonth = month;
	hireyear = year;
    }
    
    public void print(){
	System.out.println(name + " " + salary + " " + hireYear());
    }
    
    public void raiseSalary(double byPercent){
	salary *= 1 + byPercent / 100;
    }
    
    public int hireYear(){
	return hireyear;
    }
	
    private String name;	
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
	
    public int compare(Sortable b){
	Employee eb = (Employee) b;
	if (salary<eb.salary) return -1;
	if (salary>eb.salary) return +1;
	return 0;
    }
}
