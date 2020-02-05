package com.ss.designPatterns.casestudy.rendering;

import com.ss.designPatterns.casestudy.documentstructure.improved.*;

public class RenderingSystem {

	private WorldObjectRenderer renderer;
	
	public void render(WorldObject object){
		renderer.render(object);
	}
	
	public void setWorldObjectRenderer(WorldObjectRenderer renderer){
		this.renderer = renderer;
	}
	
}
