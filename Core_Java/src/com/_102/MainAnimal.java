package com._102;

public class MainAnimal {
	
	public static void getNoise(Animal animal) {
		animal.makeNoise();
	}
	
	public static void main(String[] args) {
		getNoise(new Dog());
		getNoise(new Cat());
	}

}
