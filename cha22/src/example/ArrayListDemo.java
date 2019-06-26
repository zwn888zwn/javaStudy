package example;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Card> cardList=new ArrayList<Card>();
		cardList.add(new Card("ºìÌÒ","A"));
		cardList.add(new Card("Ã·»¨","2"));
		cardList.add(new Card("·½¿é","4"));
		cardList.add(new Card("ºÚÌÒ","K"));
		cardList.add(new Card("ºìÌÒ","7"));
		System.out.println(cardList);
		/*cardList.remove(new Card("·½¿é","4"));
		System.out.println(cardList);*/
		for(int i=0;i<cardList.size();i++){
			System.out.println(cardList.get(i));
		}
		
		
	}

}
