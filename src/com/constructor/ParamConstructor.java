package com.constructor;

public class ParamConstructor {
	String languages;

	  // constructor accepting single value
	  ParamConstructor(String lang) {
	    languages = lang;
	    System.out.println(languages + " Programming Language");
	  }

	  public static void main(String[] args) {

	    // call constructor by passing a single value
	    ParamConstructor obj1 = new ParamConstructor("Java");
	    ParamConstructor obj2 = new ParamConstructor("Python");
	    ParamConstructor obj3 = new ParamConstructor("C");


}
}
