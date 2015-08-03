package com.springmybatis.beans;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer eId;
	
	private String eName;

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + "]";
	}
	
}
