package com.project.mini;
import java.util.*;
public class QueueClass {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer> ();
		q.add(50);
		q.add(25);
		q.add(15);
		q.add(45);
		q.add(30);
		System.out.println(q);
		while (!q.isEmpty()) {
		System.out.print(q.remove() + " ");
		}
		System.out.println("");
		System.out.println(q);
		}
		}

	


