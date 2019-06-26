package homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		ArrayList<MyDate> dateList=new ArrayList<MyDate>();
		dateList.add(new MyDate(2011,11,11));
		dateList.add(new MyDate(2012,11,12));
		dateList.add(new MyDate(2012,11,11));
		Iterator it=list(dateList).iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static ArrayList list(ArrayList al){
		ArrayList dateList=new ArrayList();
		while(al.size()!=0){
			int min=0;
			for(int k=1;k<al.size();k++){
				if(((MyDate)al.get(min)).compareTo(al.get(k))==1){
					min=k;
				}
			}
			dateList.add(al.get(min));
			al.remove(min);
		}
		return dateList;
	}

}
