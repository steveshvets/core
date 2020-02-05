package com.ss.designPatterns.casestudy.rendering;

import com.ss.designPatterns.casestudy.documentstructure.improved.*;

public class QuickRenderer implements WorldObjectRenderer{

	@Override
	public void render(WorldObject object) {
		System.out.println("I'm rendering with the quick renderer");
		
	}

}
