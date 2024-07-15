
class Emp {
	int id;
	String name;

	Emp() {
	}

	Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void info() {
		System.out.println(this.id + " -- " + this.name);
	}
}

class Programmer extends Emp {

	int salary;
	String dept;

	Programmer() {
	}

	Programmer(int sal, String dept) {
		this.salary = sal;
		this.dept = dept;
	}

	Programmer(int id, String name, int sal, String dept) {
		this.salary = sal;
		this.dept = dept;
		this.id = id;
		this.name = name;
	}
}

abstract class Animal {
	abstract void move();

	abstract void eat();

	void lable() {
		System.out.println("Animal's data.");
	}
}

class Bird extends Animal {
	void move() {
		System.out.println("fly.");
	}

	void eat() {
		System.out.println("Eats bird");
	}
}

public class Oops {

	public static void main(String[] args) {
		System.out.println("Object Oriented Programming.");
		Oops oop = new Oops();

		// Inheritance
		Programmer p = new Programmer(101, "Akshay", 25000, "AppDev");
		System.out.println(p.salary);
		p.info();

		// Abstraction

	}
}
