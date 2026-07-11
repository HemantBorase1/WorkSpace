package DSA.StackDemo;

public class StackEmptyException {

	private String msg="Stack is Empty!!!";
	
	public StackEmptyException() {
		
	}
	public StackEmptyException(String name) {
		this.msg=msg;
	}
	public String toString() {
		return getClass().getName()+msg;
	}
}
