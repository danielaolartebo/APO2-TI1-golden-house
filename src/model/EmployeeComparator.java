package model;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeeAccount>{

	@Override
	public int compare(EmployeeAccount employee1, EmployeeAccount employee2) {
	
		return employee1.getFirstName().compareTo(employee2.getFirstName());
	}
	
}
