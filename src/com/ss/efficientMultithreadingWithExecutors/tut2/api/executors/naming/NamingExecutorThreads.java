package com.ss.efficientMultithreadingWithExecutors.tut2.api.executors.naming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.ss.efficientMultithreadingWithExecutors.tuts.common.LoopTaskC;
import com.ss.efficientMultithreadingWithExecutors.tuts.common.NamedThreadsFactory;

public class NamingExecutorThreads {
	
	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[" + currentThreadName + "] Main thread starts here...");
		
		ExecutorService execService = Executors.newCachedThreadPool(new NamedThreadsFactory());
		
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
		
		System.out.println("[" + currentThreadName + "] Main thread ends here...");
	}
}
