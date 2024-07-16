/*	Inheritance	*/
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

/* Abstraction */
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

class Fish extends Animal {
	void move() {
		System.out.println("Swims in water.");
	}

	void eat() {
		System.out.println("Eats seafood.");
	}
}

/* Interface Abstraction */
interface AnimalI {
	public void eat();

	public void sound();
}

interface BirdI {
	int numberOfLegs = 2;
	String eat = "birdfood";

	public void fly();
}

class Eagle implements AnimalI, BirdI {
	public void eat() {
		System.out.println("Eats snakes.");
	}

	public void sound() {
		System.out.println("whistl sound.");
	}

	public void fly() {
		System.out.println("up to 10k feet.");
	}
}

/* Encapsulation */
class Person {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}

public class Oops {

	public static void main(String[] args) {
		System.out.println("Object Oriented Programming.");
		// Oops oop = new Oops();

		// Inheritance
		Programmer p = new Programmer(101, "Akshay", 25000, "AppDev");
		System.out.println(p.salary);
		p.info();

		// Abstraction
		Animal birdObj = new Bird();
		Animal tuna = new Fish();

		tuna.lable();
		birdObj.eat();
		tuna.eat();
		birdObj.move();
		tuna.move();

		/* Interface Abstraction */
		Eagle myEagle = new Eagle();
		myEagle.eat();
		myEagle.fly();
		myEagle.sound();
		System.out.println(BirdI.numberOfLegs + "  " + BirdI.eat);

		// Encapsulation
		Person men = new Person();
		men.setName("Akshay");
		men.setAge(21);

		System.out.println(men.getName() + "   " + men.getAge());

	}
}
