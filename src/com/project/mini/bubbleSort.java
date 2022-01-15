package com.project.mini;
import java.util.Scanner;

public class bubbleSort {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int[]  arr = new int[n];
		System.out.print("Enter " +n+" Elements in Random Order: ");
	      for(int i=0; i<n; i++)
	         arr[i] = sc.nextInt();
	    
	      System.out.println("\n\nSorting the array...");
	      for(int i=0; i<(n-1); i++)
	      {
	         for(int j=0; j<(n-i-1); j++)
	         {
	            if(arr[j]>arr[j+1])
	            {
	               int temp = arr[j];
	               arr[j] = arr[j+1];
	               arr[j+1] = temp;
	            }
	         }
	      }
	      
	      System.out.println("The array is sorted successfully!");
	      
	      System.out.println("\nThe new sorted array is:");
	      for(int i=0; i<n; i++)
	         System.out.print(arr[i]+ " ");
		
	}
	
	
}

