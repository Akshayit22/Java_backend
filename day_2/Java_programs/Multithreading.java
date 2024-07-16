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

class B extends Thread {
	@Override
	public void run() {
		System.out.println("Class B start :");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nClass B finished.");
	}
}

class AR implements Runnable {
	@Override
	public void run() {
		System.out.println("Class AR start :");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nClass AR finished.");
	}
}

class BR implements Runnable {
	@Override
	public void run() {
		System.out.println("Class BR start :");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nClass BR finished.");
	}
}

public class Multithreading {
	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		a.start();
		b.start();

		AR ar = new AR();
		Thread ta = new Thread(ar);

		BR br = new BR();
		Thread tb = new Thread(br);

		ta.start();
		tb.start();
	}
}
