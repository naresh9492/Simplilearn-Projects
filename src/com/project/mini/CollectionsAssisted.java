package com.project.mini;
import java.util.*;
public class CollectionsAssisted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating arraylist
				System.out.println("ArrayList");
				ArrayList<String> fruit=new ArrayList<String>();   
			      fruit.add("Banana");//
			      fruit.add("Apple");
			      fruit.add("Grapes");
			      System.out.println(fruit);  
				
				//creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vec = new Vector();
			      vec.addElement(15); 
			      vec.addElement(30); 
			      System.out.println(vec);
				
				//creating linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> country=new LinkedList<String>();  
			      country.add("Australia");  
			      country.add("Japan");
			      country.add("India");
			      Iterator<String> itr=country.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			       
			       //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(101);  
			       set.add(103);  
			       set.add(102);
			       set.add(104);
			       System.out.println(set);
			       
			       //creating linkedhashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(11);  
			       set2.add(13);  
			       set2.add(12);
			       set2.add(14);	       
			       System.out.println(set2);
			      }

	}

}
