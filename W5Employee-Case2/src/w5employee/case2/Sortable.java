package w5employee.case2;

/**
 * <h1>Kasus 3 (Case 2)</h1>
 * Program  : Sortable.java  
 * NIM      : 221524058
 * Nama     : Salsabil Khoirunisa
 * Versi    : 1.0
 * Tanggal  : 17 Februari 2023
 */

interface Sortable {
    public int compare(Sortable temp);
	public static void shell_sort(Sortable[] staff) {
            int n  = staff.length;
            for (int jarak = n/2; jarak > 0; jarak /= 2) {
		for (int i = jarak; i < n; i++) {
	            Sortable temp = staff[i];
	            int j;
	            for (j = i; j >= jarak && staff[j - jarak].compare(temp) >   0; j -= jarak) {
	                staff[j] = staff[j - jarak];
	            }
	            staff[j] = temp;
                }
	    }
	}
        
	public void raiseSalary(double i);
	public void print();
    
}
