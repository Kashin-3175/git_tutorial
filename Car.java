package day4;

public class Dog {
	String name;
	int age;

	void bark() {
		System.out.println(name + "is bark");
	}
	void displayAge() {
		System.out.println(name + "is" + age + "years old");
	}

}

public static void main(String[] args) {
	Dog dog1 = new Dog();
	dog1.name = "SiBa";
	dog1.age = 3;

	Dog dog2 = new Dog();
	dog2 .name = "ChiWaWa";l
	dog2.age = 5;

	dog1.bark();
	dog1.displayAge();

	dog2.bark();
	dog2.displayAge();

}
