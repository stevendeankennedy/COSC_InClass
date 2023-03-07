package edu.frostburg.InClass.Mar0723;

public class Student implements Comparable{
	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		return name.compareTo((String)o);
	}
}
