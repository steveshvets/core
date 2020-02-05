package com.ss.designPatterns.casestudy.rendering;

import com.ss.designPatterns.casestudy.documentstructure.improved.*;

public class DetailedRenderer implements WorldObjectRenderer{

	@Override
	public void render(WorldObject object) {
		System.out.println("I'm rendering with the detailed image renderer");
		
	}

}
