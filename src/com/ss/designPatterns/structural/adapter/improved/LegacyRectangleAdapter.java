package com.ss.designPatterns.structural.adapter.improved;

//use reference to legacy
public class LegacyRectangleAdapter extends Rectangle{
    private LegacyRectangle legacyRectangle;
    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }
    @Override
    public Integer determineSize() {
        return legacyRectangle.calculateSize();
    }
}
