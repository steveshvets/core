package com.ss.efficientMultithreadingWithExecutors.tut1.api.executors.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.ss.efficientMultithreadingWithExecutors.tuts.common.LoopTaskA;


public class UsingSingleThreadExecutor {
	
	public static void main(String[] args) {
		System.out.println("Main thread starts here...");
		
		ExecutorService execService = Executors.newSingleThreadExecutor();
		
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		
		execService.shutdown();
		
		System.out.println("Main thread ends here...");
		
	}
}
