import java.util.Stack;

public class MultiThreading {

	public static void main(String[] args) {
		Stack postBox = new Stack();
		 Thread conThread = new Consumer(postBox);
		 Thread prodThread = new Producer(postBox);
		 conThread.start();
		 prodThread.start();
}
}
class Consumer extends Thread{
	private Stack postBox;
	
	public Consumer(Stack postBox) {
		this.postBox = postBox;
	}
	 
	@Override
	public void run() {
		System.out.println("Consuming message");
		System.out.println(postBox.pop());
	}
}

class Producer extends Thread{
	private Stack postBox;
	
	public Producer(Stack postBox) {
		this.postBox= postBox;
	}
	
	@Override
	public void run() {
		System.out.println("producing message");
		postBox.add("Hi how r u?");
	}
}