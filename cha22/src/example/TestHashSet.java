package example;

import java.util.*;
import java.util.Iterator;

public class TestHashSet {
	public static void main(String[] args) {
		TreeSet set1=new TreeSet();
		//set1.add("London");
		//set1.add("南京");
		//set1.add("上海");
		set1.add(new Circle(5.0));
		set1.add(new Circle(5.1));
		//set1.add("南京");
		//System.out.println(set1);
//		Iterator ite=set1.iterator();
//		while(ite.hasNext()){
//			System.out.println(ite.next());
//		}
		for(Object eme:set1){
			System.out.println(eme);
		}
	}

}
