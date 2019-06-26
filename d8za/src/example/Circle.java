package example;

public class Circle {
	private double radius;
	Circle(double radius){
	 if(radius>=0)
		this.radius=radius;
	}
	double getArea(){
		return Math.PI*radius*radius;
	}
	 double getRadius(){
		return radius;
	}
	 void setRadius(double r){
	 if(r>0)
		radius=r;
	}

}
