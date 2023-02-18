package w5employee.case1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * <h1>Kasus 3 (Case 1)</h1>
 * Program  : Manager.java  
 * NIM      : 221524058
 * Nama     : Salsabil Khoirunisa
 * Versi    : 1.0
 * Tanggal  : 17 Februari 2023
 */

public class Manager extends Employee{
    public Manager (String n, double s, int d, int m, int y){
	super(n, s, d, m, y);
	secretaryName = "";
    }

    public void raiseSalary(double byPercent){
	// add 1/2% bonus for every year of service
	GregorianCalendar todaysDate = new GregorianCalendar();
	int currentYear = todaysDate.get(Calendar.YEAR);
	double bonus = 0.5 * (currentYear - hireYear());
	super.raiseSalary(byPercent + bonus);
    }
    
    public String getSecretaryName(){
	return secretaryName;
    }
    
    private String secretaryName;    
}
