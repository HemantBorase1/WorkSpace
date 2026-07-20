package com.demo;

import java.util.NoSuchElementException;
//import java.util.IndexOutOfBoundsException;
public class MyLinkedList<E> {

		private Node<E> head,last=null;
		
		public boolean isEmpty() {
			return head==null;
		}
		
		public int size() {
			int count=0;
			if(!isEmpty()) {
				Node<E> temp=head;
				while(temp!=null) {
					count++;
					temp=temp.next;
				}
			}
			return count;
		}
		public String toString() {
			StringBuilder sb=new StringBuilder("[");
			if(!isEmpty()) {
				Node<E> temp=head;
				while(temp!=null) {
					sb.append(temp.data);
					sb.append(",");
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
			else {
				throw new NoSuchElementException();
			}
		}
		public E last() {
			if(!isEmpty()) {
				return last.data;
			}
			else {
				throw new NoSuchElementException();
			}
		}
		public void addlast(E data) {
		    Node<E> newNode = new Node(data);

		    if (isEmpty()) {
		        head = newNode;
		        last = newNode;
		    } else {
		        last.next = newNode;
		        newNode.prev = last;
		        last = newNode;
		    }
		}
		public void addfirst(E data) {
		    Node<E> newNode = new Node(data);

		    if (isEmpty()) {
		        head = newNode;
		        last = newNode;
		    } else {
		        newNode.next = head;
		        head.prev = newNode;
		        head = newNode;
		    }
		}
		public void insert(int index,E data) {
			int size=size();
			if(index>=0&&index<size) {
				if(index==0) {
					addfirst(data);
				}
				else {
					int count=0;
					Node<E> newNode=new Node(data);
					Node<E> temp=head;
					
					while(count<index-1) {
						count++;
						temp=temp.next;
					}
					newNode.next=temp.next;
					newNode.prev=temp;
					temp.next=newNode;
					newNode.next.prev=newNode;
				}
			}else {
				throw new IndexOutOfBoundsException();
		}
			
		}
		public E removeFirst() {
			if(!isEmpty()) {
				E data=head.data;
				if(head==last) {
					head=null;
					last=null;
					return data;
				}else {
					head=head.next;
					head.prev=null;
				}
				return data;
				
			}
			throw new NoSuchElementException();
		}
		public E removelast() {
			if(!isEmpty()) {
				E data=last.data;
				if(head==last) {
					head=null;
					last=null;
				}else {
					last=last.prev;
					last.next=null;
				}
				return data;
			}
			throw new NoSuchElementException();
		}
		public E remove(int index) {
			int size=size();
			if(index>=0&&index<size) {
				if(index==0)
					return removeFirst();
				else if(index==size-1) {
					return removelast();
				}
				else {
					Node<E> temp=head;
					int count=0;
					while(count<index-1) {
						count++;
						temp=temp.next;
					}
					E data=temp.next.data;
					temp.next=temp.next.next;
					temp.next.prev=temp;
				
					return data;
				}
				
			}
			throw new IndexOutOfBoundsException();
		}
       
}


