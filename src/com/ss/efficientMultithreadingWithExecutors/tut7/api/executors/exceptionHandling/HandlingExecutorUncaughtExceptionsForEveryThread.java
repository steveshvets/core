package com.ss.efficientMultithreadingWithExecutors.tut7.api.executors.exceptionHandling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.ss.efficientMultithreadingWithExecutors.tuts.common.ExceptionLeakingTask;
import com.ss.efficientMultithreadingWithExecutors.tuts.common.ThreadExceptionHandler;


public class HandlingExecutorUncaughtExceptionsForEveryThread {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here...");
		
		Thread.setDefaultUncaughtExceptionHandler(new ThreadExceptionHandler("DEFAULT_HANDLER"));
		
		ExecutorService execService1 = Executors.newCachedThreadPool();
		execService1.execute(new ExceptionLeakingTask());
		execService1.execute(new ExceptionLeakingTask());
		execService1.execute(new ExceptionLeakingTask());
		
		ExecutorService execService2 = Executors.newCachedThreadPool();
		execService2.execute(new ExceptionLeakingTask());
		execService2.execute(new ExceptionLeakingTask());
		execService2.execute(new ExceptionLeakingTask());
		
		execService1.shutdown();
		execService2.shutdown();
		
		System.out.println("[" + currentThreadName + "] Main thread ends here...");
	}
}
