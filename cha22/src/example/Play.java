package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Play {
	public static void main(String[] args) {
		String[] colors = { "ºÚÌÒ", "ºìÌÒ", "Ã·»¨", "·½¿é" };
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		ArrayList<Card> cardList = new ArrayList<Card>();
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < 13; k++) {
				cardList.add(new Card(colors[i], numbers[k]));
			}
		}
		Collections.shuffle(cardList);
		HashMap<String, ArrayList> hm = new HashMap<String, ArrayList>();
		for (int i = 1; i <= 4; i++) {
			ArrayList<Card> play = new ArrayList<Card>();
			for (int k = 0; k < 13; k++) {
				play.add(cardList.remove(0));
			}
			hm.put("play" + i, play);
		}
		Set set=hm.entrySet();
		Iterator ite=set.iterator();
		while(ite.hasNext()){
			Map.Entry me=(Map.Entry)ite.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
	}
}
