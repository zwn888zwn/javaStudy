package example;

import Circle;

public class Column  extends Circle implements Comparable {
	private double h;
	Column(double radius,double h){
		super(radius);
		this.h=h;
	}
	public double getV(){
		return Math.PI*this.getRadius()*this.getRadius()*h;
	}
	public String toString(){
		return super.toString()+"¸ß:"+h;
	}
	public int compareTo(Object o){
		if(this.getV()<((Column)o).getV())
			return -1;
		if(this.getV()>((Column)o).getV())
			return 1;
		return 0;
	}

}
