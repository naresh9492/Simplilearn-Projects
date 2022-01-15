package com.constructor;

public class ConstructorAssisted {
        private String name;
      //constructor
        ConstructorAssisted(){
        	System.out.println("Constructor called:");
        	name = "Naveen";
        	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor is invoked
		ConstructorAssisted obj = new ConstructorAssisted();
		System.out.println("The name is " + obj.name );

	}

}
