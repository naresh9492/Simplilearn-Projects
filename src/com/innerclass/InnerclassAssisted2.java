package com.innerclass;

public class InnerclassAssisted2 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		InnerclassAssisted2  ob=new InnerclassAssisted2 ();  
		ob.display();  
		}
	}

