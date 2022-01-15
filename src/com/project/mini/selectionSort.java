package com.project.mini;
import java.util.Scanner;
public class selectionSort {
	public static void main(String[] args) {
		int total, i, j, count, small, index=0, x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		total = sc.nextInt();
		int[] arr = new int[total];
		
		System.out.print("Enter " +total+ " Elements for the Array: ");
	      for(i=0; i<total; i++)
	         arr[i] = sc.nextInt();
	      
	      for(i=0; i<(total-1); i++)
	      {
	         count=0;
	         small = arr[i];
	         for(j=(i+1); j<total; j++)
	         {
	            if(small>arr[j])
	            {
	               small = arr[j];
	               count++;
	               index = j;
	            }
	         }
	         if(count!=0)
	         {
	            x = arr[i];
	            arr[i] = small;
	            arr[index] = x;
	         }
	      }
	      System.out.println("\nThe new sorted array is: ");
	      for(i=0; i<total; i++)
	         System.out.print(arr[i]+ " ");
	      
	}

}
