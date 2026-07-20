package com.DSA;

import java.util.NoSuchElementException;
public class MyCircularLinkedList<E> {

	private Node<E> head=null;
	private int count=0;
	
	public boolean isEmpty() {
		return count==0;
	}
	public int size() {
		return count;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder("[");
		if(!isEmpty()) {
			Node<E> temp=head;
			int c=0;
			while(c<count) {
				sb.append(temp.data);
				sb.append(",");
				c++;
				temp=temp.next;
			}
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append("]");
		return sb.toString();
	}
	
	public E first() {
		if(!isEmpty()) {
			return head.data;
		}
		throw new NoSuchElementException();
	}
	
	public E last() {
		if(!isEmpty()) {
			return head.prev.data;
		}
		throw new NoSuchElementException();
	}
	
	public void addLast(E data) {
		Node<E> newNode=new Node(data);
		if(isEmpty()) {
			head=newNode;
			head.next=head;
			head.prev=head;
		}
		else {
			newNode.prev=head.prev;
			newNode.prev.next=newNode;
			newNode.next=head;
			head.prev=newNode;
		}
		count++;
	}
	public void insert(int index,E data) {
		if(!isEmpty()) {
			if(index>0 && index<size()-1) {
				if(index==0||index==size()-1)
				{
					addLast(data);
				}
				else {
					Node<E> newNode=new Node(data);
					Node<E> temp=head;
					int counter=0;
					while(counter<index-1) {
						count++;
						temp=temp.next;
					}
					newNode.next=temp.next;
					temp.next.prev=newNode;
					newNode.prev=temp;
					temp.next=newNode;
					
				}
			}
		}
	}
	
	public void forwardInfiniteIterator() {
		if(!isEmpty()) {
			Node<E> temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	
}
