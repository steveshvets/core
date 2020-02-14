package com.ss.javaIntermediateInterviewQuestions.Collections.computrade;

import java.util.Objects;

public class Student {
	private Integer studentID;
	private String name;
	
	public Student(Integer studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public Student( String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentID=").append(studentID).append(", name=").append(name).append("]");
		return builder.toString();
	}

	public Integer getStudentID() {
		return studentID;
	}
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Objects.equals(studentID, student.studentID) &&
				Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentID, name);
	}
}
