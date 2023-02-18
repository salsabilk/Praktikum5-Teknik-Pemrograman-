package w5employee.case2;

/**
 * <h1>Kasus 3 (Case 2)</h1>
 * Program  : ManagerTest.java  
 * NIM      : 221524058
 * Nama     : Salsabil Khoirunisa
 * Versi    : 1.0
 * Tanggal  : 17 Februari 2023
 */

public class ManagerTest {
    public static void main(String[] args) {
        Sortable[] staff = new Employee[4];
	staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
	staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
	staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
	staff[3] = new Manager("Salsabil Khoirunisa", 2500000, 24, 12, 2003);
        
	int i;
	for (i = 0; i < 4; i++) staff[i].raiseSalary(5);
	for (i = 0; i < 4; i++) staff[i].print();
	Sortable.shell_sort(staff);
        System.out.println("\n");
	for (i = 0; i < 4; i++) staff[i].print();
    }
    
}
