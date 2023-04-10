package com._101;

class Animal{
	Animal(){
		System.out.println("Inside animal constructor.");
	}
	void sleep(String name) {
		System.out.println(name+" is sleeping");
	}
	void walk(String name) {
		System.out.println(name+" is walking");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Dog d1= new Dog();
		d1.sleep("dog");
		d1.speak("dog");
		

	}

}

class Dog extends Animal{
	void speak(String name) {
		System.out.println(name+" is barking");
	}
}


