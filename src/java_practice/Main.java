package java_practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(3);
		
		Runnable command = () -> {
			String thread = Thread.currentThread().getName();
			System.out.println(thread + ": Hello World!");
		};
		
		for (int i = 0; i < 5; i++) {
			exec.execute(command);
			exec.execute(command);
			exec.execute(command);
        }
		exec.shutdown();
		
	}
}