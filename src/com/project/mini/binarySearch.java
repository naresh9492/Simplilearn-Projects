package com.project.mini;
import java.util.*;
public class binarySearch {
	//@author : Naresh

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,12,34,7,45};
		
		//sorting Array list using sort()
		Arrays.sort(arr);
		int key = 7;
		int result = Arrays.binarySearch(arr,key);
		if(result>=0) {
			System.out.println(key + " found at index = "+ result);
		}else {
			System.out.println(key + "Not found ");
			
			
				
			}
			
		}

	}


