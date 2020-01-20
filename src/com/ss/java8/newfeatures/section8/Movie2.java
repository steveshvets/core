package com.ss.java8.newfeatures.section8;

public class Movie2 {

    private String name;
    private String result;

    public Movie2(String name, String result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Movie2{" +
                "name='" + name + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
