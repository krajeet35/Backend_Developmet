package com._103;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q1= new PriorityQueue<>();
		q1.add(10);
		q1.add(5);
		q1.add(20);
		q1.add(2);
		System.out.println(q1);
		
		Queue<Integer> q2= new ArrayDeque<>();
		q2.add(10);
		q2.add(5);
		q2.add(20);
		q2.add(2);
		System.out.println(q2);

	}

}
