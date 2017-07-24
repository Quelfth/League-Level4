package thread_pool;

import java.util.Stack;

public class Worker implements Runnable {
	private Stack<Task> taskQueue;
	
	public Worker(Stack<Task> taskQueue){
		this.taskQueue = taskQueue;
	}

	@Override
	public void run() {
		while(!taskQueue.isEmpty())
			taskQueue.pop().perform();
	}


}
