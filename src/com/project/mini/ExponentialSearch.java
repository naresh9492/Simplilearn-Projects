package com.project.mini;
import java.util.*;
public class ExponentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		int[] arr = {4,2,34,84,56,35,5,6};
		//sort the array elements using sort()method
		Arrays.sort(arr);
		System.out.println("Sorted Array-" + Arrays.toString(arr) );
		System.out.println("enter value to search:");
		int ele = sc.nextInt();
		int i = exponentialSearch(arr, ele);
		if(i!= -1){
		      System.out.println("Searched item " + arr[i] + " found at index "+i);
		    }else{
		      System.out.println("Searched item " + ele + " not found in the array");
		    }
		    sc.close();
		  }
		    
		  private static int exponentialSearch(int[] arr, int ele){
		    int bound = 1;
		    // increase upper bound 
		    while (bound < arr.length && arr[bound] < ele) {
		      bound *= 2;
		    }
		    // do binary search with in the range
		    return binarySearch(arr, bound/2, Integer.min(bound + 1, arr.length), ele);
		  }

		  private static int binarySearch(int[] arr, int start, int end, int ele){
		    // exit condition
		    if(start > end){
		      return -1;
		    }        
		    int middle = (start+end)/2;
		    // element found
		    if(ele == arr[middle]){
		      return middle;
		    }
		    // left half
		    if(ele < arr[middle]){
		      return binarySearch(arr, start, middle-1, ele);
		    }else{
		      // right half
		      return binarySearch(arr, middle+1, end, ele); 
		
	}

		  }
}
