package com.ss.java8.newfeatures.section6;

public class SoftwareEngineer {
    private String name;
    private int age;
    private boolean isHavingGf;

    public SoftwareEngineer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHavingGf() {
        return isHavingGf;
    }

    public void setHavingGf(boolean havingGf) {
        isHavingGf = havingGf;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isHavingGf=" + isHavingGf +
                '}';
    }
}
