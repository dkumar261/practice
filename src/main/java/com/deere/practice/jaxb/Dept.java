package com.deere.practice.jaxb;

import javax.xml.bind.annotation.XmlElement;

public class Dept {

	public String dept = "ddd";

	@XmlElement
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
