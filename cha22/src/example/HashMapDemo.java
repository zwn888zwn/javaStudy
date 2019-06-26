package example;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Card> map=new HashMap<String,Card>();
		map.put("Íæ¼Ò1", new Card("ºÚÌÒ","2"));
		map.put("Íæ¼Ò2", new Card("ºìÌÒ","3"));
		map.put("Íæ¼Ò3", new Card("ºÚÌÒ","10"));
		map.put("Íæ¼Ò4", new Card("·½¿é","2"));
		System.out.println(map);
		Card c=map.get("Íæ¼Ò3");
		System.out.println(c);
		HashMap<String,String> mapCity=new HashMap<String,String>();
		mapCity.put("Î÷²Ø", "À­Èø");
		mapCity.put("ÁÉÄş", "ÉòÑô");
		mapCity.put("½­ËÕ", "ÄÏ¾©");
		mapCity.remove("ÁÉÄş");
		Set set=mapCity.entrySet();
		Iterator ite=set.iterator();
		while(ite.hasNext()){
			Map.Entry me=(Map.Entry)ite.next();
			System.out.print(me.getKey()+" ");
			System.out.println(me.getValue());
		}
	}

}
