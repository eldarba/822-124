package emps.core;

import java.util.Collection;
import java.util.Iterator;

/**
 * EmployeeStatistics is a utility class. It gives statistic information for any
 * Employee collections provided.
 */
public class EmployeeStatistics {

	/**
	 * takes a collection of Employees and calculates the average salary and returns
	 * it
	 * 
	 * @param emps the collection
	 * @return the average salary
	 */
	public static double averageSalary(Collection<? extends Employee> emps) {
		double salarySum = 0D;
		int numOfEmps = 0;
		Iterator<? extends Employee> it = emps.iterator();
		while (it.hasNext()) {
			Employee currEmp = it.next();
			if (currEmp != null) {
				salarySum += currEmp.getSalary();
				numOfEmps++;
			}
		}
		return salarySum / numOfEmps;
	}

	/**
	 * takes a collection of Employees and returns the number of employees in the
	 * list
	 * 
	 * @param emps the collection
	 * @return the number of employees in the collection
	 */
	public static int numOfEmployees(Collection<? extends Employee> emps) {
		int numOfEmps = 0;
		Iterator<? extends Employee> it = emps.iterator();
		while (it.hasNext()) {
			Employee currEmp = it.next();
			if (currEmp != null) {
				numOfEmps++;
			}
		}
		return numOfEmps;
	}

	/**
	 * takes a collection of Employees and department name and returns the number of
	 * employees in the specified department
	 * 
	 * @param emps           the collection
	 * @param departmentName the name of the department
	 * @return
	 */
	public static <T extends Employee> int numOfEmployees(Collection<T> emps, String departmentName) {
		int numOfEmps = 0;
		Iterator<T> it = emps.iterator();
		while (it.hasNext()) {
			Employee currEmp = it.next();
			if (currEmp != null && currEmp.getDepartment().equals(departmentName)) {
				numOfEmps++;
			}
		}
		return numOfEmps;
	}

}
