package DSA.StackLinkedlist;
import java.util.NoSuchElementException;

public class MyStack<E> {

		private Node<E> head,last;
		public boolean isEmpty() {
			return head==null;
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
		
		public void push(E data) {
			Node<E> newNode=new Node(data);
			if(head==null) {
				head=newNode;
				last=head;
			}else {
				newNode.prev=last;
				last.next=newNode;
				last=newNode;
			}
		}
		
		public E pop() {
			if(!isEmpty()) {
				E data=last.data;
				last=last.prev;
				last.next=null;
				return data;
			}
			throw new NoSuchElementException();
		}
		public E peek() {
			if(!isEmpty()) {
				return last.data;
			}
			throw new NoSuchElementException();
		}
		public int search(E data) {
			if(!isEmpty()) {
				Node<E> temp=last;
				int count=1;
				while(temp!=null) {
					if(temp.data==data) {
						return count;
					}
					count++;
					temp=temp.prev;
				}
			}
			return -1;
		}
	
}
