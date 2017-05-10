package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread (() -> System.out.println("Lambda: run()"));
//				(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Runnable: run()");
//			}
//		});
		myThread.run();
	}
}
