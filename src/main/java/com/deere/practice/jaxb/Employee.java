package com.deere.practice.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

//@XmlSeeAlso(Dept.class)
@XmlRootElement
public class Employee {
	private int id;
	private String name;
	private float salary;

	public Employee() {
	}

	public Employee(int id, String name, float salary,String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}