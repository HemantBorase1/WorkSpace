package com.demo;

public class Node<E> {

	public E data;
	public Node<E> prev,next;
	
	public Node(E data) {
		this.data=data;
		prev=null;
		next=null;
	}
}
