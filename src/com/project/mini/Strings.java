package com.project.mini;

public class Strings {
	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings:");
		//length of a string
		System.out.println("1.Length of a String");
		System.out.println("---------------------");
		String sl=new String("Hello Master");
		System.out.println(sl.length());

		//substring
		System.out.println("2.Substring");
		System.out.println("---------------------");
		String sub=new String("Welcome to the World");
		System.out.println(sub.substring(4));

		//String Comparison
		System.out.println("3.String Comparison");
		System.out.println("----------------------");
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));

		//IsEmpty
		System.out.println("4.IsEmpty");
		System.out.println("----------------------");
		String s4="";
		System.out.println(s4.isEmpty());

		//toLowerCase
		System.out.println("5.toLowerCase");
		System.out.println("-----------------------");
		String s5="Hello";
		System.out.println(s5.toLowerCase());
		
		//replace
		System.out.println("6.Replace");
		System.out.println("-----------------------");
		String s6="Heldo";
		String replace=s6.replace('d', 'l');
		System.out.println(replace);
        System.out.println("\n");
        
		//equals
		System.out.println("7.Equals");
		System.out.println("-------------");
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
		System.out.println("\n");

		System.out.println("Creating StringBuffer");
		System.out.println("----------------------");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);

		//insert method
		s.insert(0, 'w');
		System.out.println(s);

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}

}
