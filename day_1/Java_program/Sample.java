import java.util.Scanner;

public class Sample {

	int n = 99; // instance var
	static int m = 100; // static var

	public enum Day {
		Sun, Mon, Tue
	};

	Sample() {
		System.out.println("Sample/main class Constructor called.");
	}

	static { // static block
		System.out.println("Static block.");
	}

	void method() {
		int n = 90; // local var
		System.out.println("Sample class method " + n);
	}

	public static void main(String[] args) {

		System.out.println("Hello, World From " + (args.length > 0 ? args[0] : "Default"));

		double d = 20.0; // decimal no. by default is double
		float f = 10.0f; // 10.0f is used to declare float
		int a = (int) f;
		byte b = (byte) a;

		System.out.println(d > f ? d : f);

		if ('a' > 'z') {
			System.out.println(true);
		} else if ('a' == 'z') {
			System.out.println(false);
		} else {
			System.out.println("Nothing");
		}

		Sample obj = new Sample();
		obj.method();

		int ch = 0;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.print("Input only number :");
			ch = sc.nextInt();

			switch (ch) {
				case 0:
					// System.exit(0);
					break;
				case 1:
					System.out.println("Input given " + ch);
					break;
				default:
					System.out.println("default case triggered");
			}

		} while (ch != 0);

	}
}