package com.project.mini;
import java.util.*;

public class ArrayRotation {
	static int[] arr = new int[] {2,4,5,9,7,};
	
	static void rotateRight() {
		//i is pointing to the satrting elemnt in array
		//j is pointing to last element
		int i=0;
		int j=arr.length - 1;
		
		while (i != j) {
            //swapping the elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Array given in input is");
        System.out.println(Arrays.toString(arr));

        rotateRight();

        System.out.println("Array after rotation is");
        System.out.println(Arrays.toString(arr));

	}

}
