package $5;

public class DeckOfCards {
  public static void main(String[] args) {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
      "10", "Jack", "Queen", "King"};
        
    // Initialize cards
    for (int i = 0; i < deck.length; i++)
      deck[i] = i;
    
    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      // Generate an index randomly
      int index = (int)(Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index]; 
      deck[index] = temp;
    }
    boolean[] zu=new boolean[4];
    // Display the first four cards
    for (int i = 0; ; i++) {
    	boolean succ=true;
     int index = (int)(Math.random() * deck.length);
      String suit = suits[deck[index] / 13];
      String rank = ranks[deck[index] % 13];
      System.out.println("Card number " + deck[i] + ": " 
        + rank + " of " + suit);
      zu[deck[index] / 13]=true;
     for(int k=0;k<zu.length;k++){
    	 if(!zu[k]){
    		 succ=false;
    		 break;
    	 }
     }
     if(succ){
    	 System.out.println("Bynber of picks: "+(i+1));
    	 break;
     }
    }
  }
}
