package com.DSA;

public class Node<E> {

	public E data;
	public Node<E> next;
	public Node<E> prev;
	
	public Node(E data) {
		this.data=data;
		next=null;
		prev=null;
	}
}
