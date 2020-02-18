package com.ss.dataStructuresInJavaPart1.reverseLinkList;

public interface List<T extends Comparable<T>> {
	public void reverse();
    public void insert(T data);
    public void remove(T data);
    public void traverseList();
    public int size();
}
