package com.project.mini;
import java.util.*;
public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> numbers = new Stack<>(); // stack of type string only string type elements can be inserted
		// Pushing new elements to the Stack
		
		numbers.push("One");
		numbers.push("Two");
		numbers.push("Three");
		numbers.push("Four");
		numbers.push("Five");
		
		int size= numbers.size(); // finding size of stack
		
		System.out.println("Stack contains => " + numbers);
		System.out.println("Size of Stack is  => " + size);
		System.out.println();
		
		
		// Popping Elements from the Stack
		
		String numbersAtTop = numbers.pop();  // Throws EmptyStackException if the stack is empty
		System.out.println("Element Removed  => " + numbersAtTop);
		System.out.println("Current State of Stack => " + numbers);
		
		size= numbers.size();
		
		System.out.println("Size of Stack is  => " + size);
		System.out.println();
		
		// Get the element at the top of the stack without removing it
		
		numbersAtTop = numbers.peek();
		
		System.out.println("Top Most elemement of stack  => " + numbersAtTop);
		System.out.println("Current State of Stack => " + numbers);
		
		// searching for an element in stack
		
		int index = numbers.search("Two");
		System.out.println("Element found at Index " + index);
		
		// check if the stack is empty
		
		boolean isempty = numbers.empty();
		System.out.println("Is Stack Empty =>  " + isempty);

	}

}
