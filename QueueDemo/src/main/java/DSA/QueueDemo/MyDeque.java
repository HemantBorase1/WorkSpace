package DSA.QueueDemo;

public class MyDeque {

	private Object a[]=null;
	private int rear,front,size;
	
	public MyDeque() {
		this(10);
	}
	public MyDeque(int Capacity) {
		a=new Object[Capacity];
		rear=-1;
		front=0;
		size=0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public boolean isfull() {
		return size==a.length;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder("[");
		if(!isEmpty()) {
			for(int i=0;i<size;i++) {
				int index=(front+i)%a.length;
				sb.append(a[index]);
				sb.append(",");
			}
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append("]");
		return sb.toString();
	}
	public boolean offerLast(Object o) {
		if(!isfull()) {
			rear=(rear+1)%a.length;
			a[rear]=o;
			size++;
			return true;
		}
		throw new QueueFullException();
	}
	public boolean offerFirst(Object o) {
		if(!isfull()) {
			front=(front-1+a.length)%a.length;
			a[front]=o;
			size++;
			return true;
		}
		throw new QueueFullException();
	}
	public boolean pollFirst() {
		if(!isfull()) {
			Object o=a[front];
			front=(front+1)%a.length;
			size--;
			return true;
		}
		throw new QueueEmptyException();
	}
	public Object pollLast() {
		if(!isEmpty()) {
			Object o=a[rear];
			rear=(rear-1+a.length)%a.length;
			size--;
			return 0;
		}
		throw new QueueEmptyException();
	}
	public Object peekFirst() {
		if(!isEmpty()) {
			return a[front];
		}
		throw new QueueEmptyException();
	}
	public Object peekLast() {
		if(!isEmpty()) {
			return a[rear];
		}
		throw new QueueEmptyException();
	}
}
