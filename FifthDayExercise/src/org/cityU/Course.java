package org.cityU;

public class Course {
	private String subname;
	private int c_code;

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public int getC_code() {
		return c_code;
	}

	public void setC_code(int c_code) {
		this.c_code = c_code;
	}

	@Override
	public String toString() {
		return "Course [subname=" + subname + ", c_code=" + c_code + "]";
	}
	

}
