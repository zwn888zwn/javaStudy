package example;

public class Card implements Comparable  {
	private String color;
	private String showNumber;
	private int number;
	public Card(String color,String showNumber){
		this.color=color;
		this.showNumber=showNumber;
		if(showNumber.equals("J"))
			number=11;
		else if(showNumber.equals("Q"))
			number=12;
		else if(showNumber.equals("K"))
			number=13;
		else if(showNumber.equals("A"))
			number=14;
		else if(showNumber.equals("2"))
			number=15;
		else
			number=Integer.parseInt(showNumber);
	}
	public String getColor(){
		return color;
	}
	public String getShowNumber(){
		return showNumber;
	}
	public int getNumber(){
		return number;
	}
	public String toString(){
		return this.getColor()+" "+this.getShowNumber();
	}
	public boolean equals(Object o){
		if(this==o)
			return true;
		if(o instanceof Card){
			if(this.getColor().equals(((Card)o).getColor())&&this.getShowNumber().equals(((Card)o).getShowNumber()))
				return true;
		}
		return false;
	}
	public int hashCode(){
		return (this.getColor()+this.getShowNumber()).hashCode();
	}
	public int compareTo(Object o){
		return (this.getNumber()-((Card)o).getNumber());
	
	}


}
