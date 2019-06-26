package example;

public class Circle implements Comparable{
	
	private double radius;
	Circle(double radius){
		this.radius=radius;
	}
	public String toString(){
		return "radius:"+radius;
	}
	public int hashCode(){
		return (int)(radius*1000);
	}
	public boolean equals(Object o){
		if(this==o)
			return true;
		else if( o instanceof Circle)
			if(this.radius==((Circle)o).radius){
			return true;
		}
		return false;	
	}
	public int compareTo(Object c){
		
		if(this.radius< ((Circle)c).radius)
			return -1;
		else if(this.equals(c))
			return 0;
		else 
			return 1;
		}
	}
	


