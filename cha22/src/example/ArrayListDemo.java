package example;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Card> cardList=new ArrayList<Card>();
		cardList.add(new Card("����","A"));
		cardList.add(new Card("÷��","2"));
		cardList.add(new Card("����","4"));
		cardList.add(new Card("����","K"));
		cardList.add(new Card("����","7"));
		System.out.println(cardList);
		/*cardList.remove(new Card("����","4"));
		System.out.println(cardList);*/
		for(int i=0;i<cardList.size();i++){
			System.out.println(cardList.get(i));
		}
		
		
	}

}
