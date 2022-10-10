package com.exercise.treesetexample;

import java.util.*;

//sort By comapareTo() method

public class Student {
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNo == other.rollNo;
	}

	@Override
	public String toString() {
		return "rNo = " + rollNo + " name = " + name;
	}
	

	public int compareTo(Student s) {

		if (this.rollNo == s.rollNo)
			return 0;
		else if (this.rollNo > s.rollNo)
			return 1;
		else
			return -1;
	}

}
