package emps.tests;

import java.util.ArrayList;
import java.util.List;

import emps.core.EmployeeStatistics;
import emps.core.Manager;

/**
 * Test class initiates an Employee collection ( ArrayList ) and calls
 * EmployeeStatistics to gather some statistic information.
 */
public class TestLab2 {

	public static void main(String[] args) {

		List<Manager> emps = new ArrayList<>();

		emps.add(new Manager(10_000, "Sales"));
		emps.add(new Manager(20_000, "Sales"));
		emps.add(new Manager(30_000, "Sales"));
		emps.add(new Manager(40_000, "Legal"));
		emps.add(new Manager(50_000, "Legal"));

//		get statistic data

		double avgSal = EmployeeStatistics.averageSalary(emps);

		int numOfEmps = EmployeeStatistics.numOfEmployees(emps);

		String department = "Legal";
		int numOfEmpsInDept = EmployeeStatistics.numOfEmployees(emps, department);

		System.out.println("Average salary: " + avgSal);
		System.out.println("Total number of employees: " + numOfEmps);
		System.out.println("Number of employees in " + department + " department: " + numOfEmpsInDept);

	}

}
