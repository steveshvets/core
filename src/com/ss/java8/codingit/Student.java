package com.ss.java8.codingit;

public class Student {

    private String name;
    private double gpa;
    private int gradeLevel;
    private String gender;

    public Student(String name, double gpa, int gradeLevel, String gender) {
        this.name = name;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", gradeLevel=" + gradeLevel +
                ", gender='" + gender + '\'' +
                '}';
    }
}
