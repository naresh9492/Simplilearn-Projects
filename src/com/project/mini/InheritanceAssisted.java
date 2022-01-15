package com.project.mini;


	class Animal {

		  // field and method of the parent class
		  String name;
		  public void eat() {
		    System.out.println("I can eat");
		  }
		  public void sleep() {
			  System.out.println("After Eating, I am now Sleeping");
		  }
		}

		// inherit from Animal
		class Dog extends Animal {

		  // new method in subclass
		  public void display() {
		    System.out.println("My name is " + name);
		  }
		}

		public class InheritanceAssisted { 
		  public static void main(String[] args) {

		    // create an object of the subclass
		    Dog labrador = new Dog();

		    // access field of superclass
		    labrador.name = "Jimmy";
		    labrador.display();

		    // call method of superclass
		    // using object of subclass
		    labrador.eat();
		    
		    labrador.sleep();

		  }
		}


