package DSA.StackDemo;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {

	private Object o[]=null;
	private int top=-1;
	
	MyStack(){
		this(10);
	}
	MyStack(int size){
		o=new Object[size];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	private boolean isFull() {
		return top==o.length-1;
	}
	public int size() {
		return top+1;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder("[");
		if(!isEmpty()) {
			for(int i=0;i<=top;i++) {
				sb.append(o[i]);
				sb.append(",");
				
			}
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append("]");
		return sb.toString();
	}
	public  void push(Object obj) {
		if(isFull()) {
			o=Arrays.copyOf(o, o.length*2);
		}
		o[++top]=obj;
	}
	public Object pop() {
		if(!isEmpty())
			return o[top--];
		throw new EmptyStackException();
	}
	public Object peek() {
		if(!isEmpty()) {
			return o[top];
		}
		throw new EmptyStackException();
	}
	public int search(Object obj) {
		if(!isEmpty()) {
			for(int i=top;i>=0;i--) {
				if(o[i]==obj) {
					return top-i+1;
				}
			}
		}
		return -1;
	}
}
