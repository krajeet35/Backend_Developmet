package com._101;

public class Song {
	String artist;
	String title;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s1= new Song();
		Song s2= new Song();
		s1.artist="Jubin Nautiyal";
		s1.title="Mast Nazron se";
		s1.play();
		s2.artist="Eminem";
		s2.title="Let me love you";
		s2.play();
		s1.play();
	}
	void play() {
		System.out.println(artist+" is singing "+title);
		System.out.println("==================");
	}

}
