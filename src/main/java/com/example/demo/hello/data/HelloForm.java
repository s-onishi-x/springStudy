package com.example.demo.hello.data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class HelloForm {
	
	public HelloForm() {
	}
	
	@NotNull
	private String val;

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
  
}
