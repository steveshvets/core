package com.ss.efficientMultithreadingWithExecutors.tut7.api.executors.exceptionHandling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.ss.efficientMultithreadingWithExecutors.tuts.common.ExceptionLeakingTask;
import com.ss.efficientMultithreadingWithExecutors.tuts.common.ThreadFactoryWithExceptionHandler;


public class HandlingExecutorUncaughtExceptionsDifferentlyPerThread {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here...");
		
		ExecutorService execService = Executors.newCachedThreadPool(new ThreadFactoryWithExceptionHandler());
		
		execService.execute(new ExceptionLeakingTask());
		execService.execute(new ExceptionLeakingTask());
		execService.execute(new ExceptionLeakingTask());
		execService.execute(new ExceptionLeakingTask());

		execService.shutdown();
		
		System.out.println("[" + currentThreadName + "] Main thread ends here...");
	}
}
