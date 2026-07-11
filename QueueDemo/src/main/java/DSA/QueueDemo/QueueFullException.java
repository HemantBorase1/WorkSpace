package DSA.QueueDemo;

public class QueueFullException extends RuntimeException {

private String msg="queue is Full!!!";
	
	public QueueFullException(String msg) {
		this.msg=msg;
	}
	public QueueFullException() {}
	
	public String toString() {
		return getClass().getName()+":"+msg;
	}
}
