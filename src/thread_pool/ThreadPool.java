package thread_pool;

import java.util.Stack;

public class ThreadPool {
	private int totalThreads;
	private Thread[] threads;
	private Stack<Task> taskQueue;

	public ThreadPool(int totalThreads) {
		this.totalThreads = totalThreads;
		taskQueue = new Stack<Task>();
		threads = new Thread[totalThreads];
		for (int i = 0; i < threads.length; i++)
			threads[i] = new Thread(new Worker(taskQueue));
	}

	public void addTask(Task task) {
		taskQueue.push(task);
	}

	public void start() {
		for(Thread T : threads)
			T.start();
			
		for (Thread T : threads)
			try {
				T.join();
			} catch (Exception e) {
			}
	}
}
