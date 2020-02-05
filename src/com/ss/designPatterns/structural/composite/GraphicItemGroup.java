package com.ss.designPatterns.structural.composite;


import java.util.ArrayList;
import java.util.List;

public class GraphicItemGroup {

    private List<Line> lines = new ArrayList<Line>();

    private List<Rectangle> rectangles = new ArrayList<Rectangle>();

    public List<Line> getLines() {
        return lines;
    }

    public List<Rectangle> getRectangles() {
        return rectangles;
    }

    public void draw(){
        for (Line line : lines) {
            line.draw();
        }

        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }
    }
}
