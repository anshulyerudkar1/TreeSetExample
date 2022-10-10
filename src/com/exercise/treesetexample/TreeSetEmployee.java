package com.exercise.treesetexample;

import java.util.*;
//customsort using int compare(type obj1 ,type obj2) method

public class TreeSetEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee(115, "Aadi", "Kolhapur");
		Employee emp2 = new Employee(116, "Rohan", "Mumbai");
		Employee emp3 = new Employee(111, "Anshul", "Pune");
		Employee emp4 = new Employee(112, "Gaourav", "Kolkata");
		
		TreeSet<Employee> employee = new TreeSet<Employee>(new SortByID());
		
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		
		System.out.println(employee);
		
		TreeSet<Employee> employee1 = new TreeSet<Employee>(new SortByName());
		
		employee1.add(emp1);
		employee1.add(emp2);
		employee1.add(emp3);
		employee1.add(emp4);
		
		System.out.println(employee1);
		
		TreeSet<Employee> employee2 = new TreeSet<Employee>(new SortByCity());
		
		employee2.add(emp1);
		employee2.add(emp2);
		employee2.add(emp3);
		employee2.add(emp4);
		
		System.out.println(employee2);
	}

}
