package w5employee.case2;

/**
 * <h1>Kasus 3 (Case 2)</h1>
 * Program  : EmployeeTest.java  
 * NIM      : 221524058
 * Nama     : Salsabil Khoirunisa
 * Versi    : 1.0
 * Tanggal  : 17 Februari 2023
 */

public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sortable[] staff = new Employee[3];
	staff[0] = new Employee("Antonio Rossi", 2400000, 1, 10, 1989);
	staff[1] = new Employee("Maria Bianchi", 2100000, 1, 12, 1991);
	staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
	int i;
	for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
	Sortable.shell_sort(staff);
	for (i = 0; i < 3; i++) staff[i].print();
    }
    
}
