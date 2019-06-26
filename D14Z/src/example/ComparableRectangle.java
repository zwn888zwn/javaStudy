package example;

public class ComparableRectangle extends Rectangle implements Comparable{
	ComparableRectangle(double w,double h){
		super(w,h);	
	}
	public int compareTo(Object o){
		double dif=this.getArea()-((ComparableRectangle)o).getArea();
		if(dif>0)
			return 1;
		else if(dif<0)
			return-1;
		else{
			return 0;
		}
	}
}
