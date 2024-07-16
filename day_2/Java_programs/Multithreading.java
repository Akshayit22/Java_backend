import java.util.*;

class A extends Thread {
	@Override
	public void run() {
		System.out.println("Class A start :");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nClass A finished.");
	}
}

class B implements Runnable {
	@Override
	public void run() {
		System.out.println("Class B start :");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nClass B finished.");
	}
}

public class Multithreading {
	public static void main(String[] args) {

		A a = new A();
		a.start();

		B b = new B();
		Thread t = new Thread(b);
		t.start();
	}
}
