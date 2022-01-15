package com.project.mini;
import java.io.*;
import java.util.*;

public class OrderStatistics {
	
	
	static PriorityQueue<Integer> min;
	static int k;

	static List<Integer> getAllKthNumber(int arr[]){
		
		// list to store kth largest number
		List<Integer> list = new ArrayList<>();

		// one by one adding values to the min heap
		for (int val : arr) {

		// if the heap size is less than k , we add to
		// the heap
		if (min.size() < k) {
			min.add(val);	
		}else {
			if (val > min.peek()) {
			min.poll();
			min.add(val);
			}
		}

		// if heap size >=k we add
		// kth largest element
		// otherwise -1

		if (min.size() >= k) {
			list.add(min.peek());
		}else {
			list.add(-1);
		}
		
	}
		return list;
	}
	
	public static void main(String[] args)
	{
		min = new PriorityQueue<>();

		k = 4;

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		List<Integer> res = getAllKthNumber(arr);

		for (int x : res)
		System.out.print(x + " ");
	}

		
	}



