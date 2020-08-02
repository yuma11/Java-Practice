package com.sample;

public class Factory {
	public static Sample create() {
		return () -> {
			System.out.println("Hello");
		};
	}
}
