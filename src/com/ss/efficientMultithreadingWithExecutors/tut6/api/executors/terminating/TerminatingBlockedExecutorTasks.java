package com.ss.efficientMultithreadingWithExecutors.tut6.api.executors.terminating;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.ss.efficientMultithreadingWithExecutors.tuts.common.FactorialTaskB;
import com.ss.efficientMultithreadingWithExecutors.tuts.common.LoopTaskA;
import com.ss.efficientMultithreadingWithExecutors.tuts.common.LoopTaskG;
import com.ss.efficientMultithreadingWithExecutors.tuts.common.NamedThreadsFactory;


public class TerminatingBlockedExecutorTasks {

	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here...");
		
		ExecutorService execService = Executors.newCachedThreadPool(new NamedThreadsFactory());
		
		LoopTaskA task1 = new LoopTaskA();
		LoopTaskG task2 = new LoopTaskG();
		FactorialTaskB task3 = new FactorialTaskB(30, 500);
		
		Future<?> f1 = execService.submit(task1);
		Future<?> f2 = execService.submit(task2);
		Future<?> f3 = execService.submit(task3);
		
		execService.shutdown();
		
		TimeUnit.MILLISECONDS.sleep(2000);
		
		System.out.println("[" + currentThreadName + "] Invoking cancel() on all the tasks ...");
		f1.cancel(true);
		f2.cancel(true);
		f3.cancel(true);
		
		System.out.println("[" + currentThreadName + "] Main thread ends here...");
	}
}
