package java_practice;

import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		IntStream stream = IntStream.of(1, 2, 3);
		System.out.println(stream.reduce(1, (x, y) -> x + y));
	}
} 