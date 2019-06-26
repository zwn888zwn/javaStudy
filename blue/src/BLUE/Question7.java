package BLUE;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Question7 {
	public static void main(String[] args) {
		List sourse=new Vector();	    
		sourse.addAll(Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));  
		System.out.println(card(sourse));
	}
	public static List card(List s){
		Vector sourse=new Vector(s);
		Vector result=new Vector();
		while(true){
			if(sourse.size()==0){
				break;
			}
			sourse.add(sourse.remove(0));
			result.add(sourse.remove(0));
		}
		return result;
		
	}

}
