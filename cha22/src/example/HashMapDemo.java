package example;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Card> map=new HashMap<String,Card>();
		map.put("���1", new Card("����","2"));
		map.put("���2", new Card("����","3"));
		map.put("���3", new Card("����","10"));
		map.put("���4", new Card("����","2"));
		System.out.println(map);
		Card c=map.get("���3");
		System.out.println(c);
		HashMap<String,String> mapCity=new HashMap<String,String>();
		mapCity.put("����", "����");
		mapCity.put("����", "����");
		mapCity.put("����", "�Ͼ�");
		mapCity.remove("����");
		Set set=mapCity.entrySet();
		Iterator ite=set.iterator();
		while(ite.hasNext()){
			Map.Entry me=(Map.Entry)ite.next();
			System.out.print(me.getKey()+" ");
			System.out.println(me.getValue());
		}
	}

}
