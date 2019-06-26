package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise22_8 {

	public static void main(String[] args) {
		String text="Good morning . Have a good class."+"Have a good visit. Have fun!";
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String[] words=text.split("[ \n\t\r.,;:!?(){]");
		for(int i=0;i<words.length;i++){
			String key=words[i].toLowerCase();
			if(key.length()>0){
				if(map.get(key)==null){
					map.put(key, 1);
				}else{
					int value=map.get(key).intValue();
					value++;
					map.put(key, value);
				}
			}
		}
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());  
		Collections.sort(list,new paixu());
		 for(Entry e:list){
			 System.out.println(e.getKey().toString()+"      "+e.getValue());
		 }
		 

	}

} class paixu implements Comparator<Map.Entry<String, Integer>>{

	public int compare(Entry<String,Integer> e1, Entry<String,Integer> e2) {
		// TODO Auto-generated method stub
		return e1.getValue()-e2.getValue();
	}

}
