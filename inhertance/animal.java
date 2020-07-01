package inheritance;
class AnimalDemo {
	void eat() {
		System.out.println("eat method");
	}
	void sleep() {
		System.out.println("Sleep method");
	}
}
class Bird extends animal{
	void eat() {
		System.out.println("Override eat method");
	}
	void sleep() {
		System.out.println("Override sleep method");
	}
	void fly() {
		System.out.println("Fly method");
	}
}
class animal{
	public static void main(String args[])
	{
		AnimalDemo a=new AnimalDemo();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}
}

