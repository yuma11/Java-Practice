package java_practice;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(3);
		
		Runnable r = () -> {
			String threadName = Thread.currentThread().getName();
			
			try {
				System.out.println(threadName + ": start");
				Thread.sleep((int)(Math.random() * 5000));
				
				System.out.println(threadName + ": waiting");
				barrier.await();
				
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
			
			System.out.println(threadName + ": end");
		};
		
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}
}