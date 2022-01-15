package com.project.mini;

class MyException extends Exception{
	   String string;
	   MyException(String str2) {
		string=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+string) ;
	   }
	}
public class Remember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyException("This is My error Message");
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}

	}

}
