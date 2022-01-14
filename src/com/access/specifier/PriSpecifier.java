package com.access.specifier;

public class PriSpecifier {

	//private Specifier
	     public static void main(String[] args){
	               int x=20;
				   int y=10;
	                sum(x,y);
	     }
	     private static void sum(int x,int y)
	    {    int s=x+y;
	          System.out.println(s);
	     }
	}