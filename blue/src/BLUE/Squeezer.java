package BLUE;

import java.util.ArrayList;

public class Squeezer { 

	 public static void main(String args[]){ 

	  ArrayList<String> list=new ArrayList(); 

	  list.add("K"); 

	  list.add("Q"); 

	  list.add("J"); 

	  list.add("10"); 
	  list.add("9"); 

	  list.add("8"); 

	  list.add("7"); 

	  list.add("6"); 

	  list.add("5"); 

	  list.add("4"); 

	  list.add("3"); 

	  list.add("2"); 

	  list.add("A"); 

	  ArrayList<String> out=new ArrayList<String>();

	  out.add(list.get(0)); 

	  list.remove(0); 

	  while(list.size()>0){ 

	   out.add(list.get(0)); 

	   list.remove(0); 

	   out.add(out.get(0)); 

	   out.remove(0); 

	  } 

	  int i=out.size()-1; 

	  while(i>0){ 

	   System.out.print(out.get(i--)+","); 

	  } 

	     System.out.print(out.get(0)); 

	   } 

	} 