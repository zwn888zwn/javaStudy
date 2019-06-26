package example;

public  class Rectangle extends Figure {
	private double width;
	private double height;
	public Rectangle(){}
	public Rectangle(double width,double height){
		this.height=height;
		this.width=width;
		
	}
	public double getArea(){
		return width*height;
	}
	
}
 class aa {
	final Rectangle r=new Rectangle();
}