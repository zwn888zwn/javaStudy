package example;

public class Column {
	private double h,r;
	Column(double h,double r){
		if(h>0)
		this.h=h;
		if(r>0)
		this.r=r;
	}
	double getVolume(){
		return Math.PI*r*r*h;
	}
	public double getH(){
		return h;
	}
	public void setH(double h){
		if(h>0)
		this.h=h;
	}
	public void setR(double r){
		if(r>0)
		this.r=r;
	}
	public double getR(){
		return r;
	}
	
//	public static void main(String[] args){
//		double v;
//		Column c1=new Column(5,4);
//		Column c2=new Column(10,10);
//		v=c2.getVolume();
//		System.out.println(v);
//	}

}
