package com.ss.efficientMultithreadingWithExecutors.tuts.common;

public interface ResultListener<T> {
	
	void notifyResult(T result);

}
