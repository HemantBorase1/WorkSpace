package DSA.StackLinkedlist;

public class Node<E>{

	public Node<E> prev,next;
	public E data;
	
	public Node(E data) {
		this.data=data;
		prev=null;
		next=null;
	}
}
