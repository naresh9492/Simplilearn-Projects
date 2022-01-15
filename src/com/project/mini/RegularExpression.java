package com.project.mini;
import java.util.regex.*;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hai";
		// Returns true if string 1 matches string 2
		System.out.println("Returns true if 'hai' matches 'Hai' :"+
		Pattern.matches(str, "Hai")); //False
		
		//Returns true if Hai or hai matches parameter 2
		System.out.println("Returns true if 'Hai' or 'hai' matches 'Hai' : "+
		Pattern.matches("[Hh]ai", "Hai")); //True
		
		// Returns true if the string matches exactly "ann" or "Ann" or "jak" or "Jak"
		System.out.println("Returns true if the string matches exactly 'ann' or 'Ann' or 'jak' or 'Jak' with 'Ann' : "+
		Pattern.matches("[aA]nn|[jJ]ak", "Ann"));//True
		
		//returns true if the string contains "with" at any place in the string
		System.out.println("returns true if the string contains 'with' in the string 'within' : " +
		Pattern.matches(".*with.*", "within"));//True
		
		// returns true if the '9448anna' does not have number in the beginning
		System.out.println( "returns true if the '9448anna' does not have number in the beginning : "+
		Pattern.matches("^[^\\d].*", "9448anna")); //False
		
		System.out.println("returns true if the '9448anna' does not have number in the beginning : " +
		Pattern.matches("^[^\\d].*", "anna9448")); //True

	}

}
