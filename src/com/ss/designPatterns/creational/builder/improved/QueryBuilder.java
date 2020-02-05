package com.ss.designPatterns.creational.builder.improved;

public interface QueryBuilder {

	void from(String from);
	
	void where(String where);
	
	Query getQuery();
	
}
