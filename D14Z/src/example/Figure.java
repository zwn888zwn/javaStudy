package example;
import java.util.Date;
public abstract class Figure {
	private String color="white" ;
	private boolean filled;
	private Date dateCreated;
	protected Figure(){
		dateCreated=new Date();
	}
	protected Figure(String color,boolean filled){
		this();
		this.color=color;
		this.filled=filled;
	}
	public  String getColor(){
		return color;
	}
	public boolean isFilled(){
		return filled;
	}
	public Date getDate(){
		return dateCreated;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void setFilled(boolean filled){
		this.filled=filled;
	}
	public String toString(){
		return "ÑÕÉ«"+color+" Ìî³ä"+filled+" ÈÕÆÚ"+dateCreated;
	}
	public abstract double getArea();
	

}
class Circle extends Figure {
	private double radius;
	Circle(){}
	Circle(double radius){
		this.radius=radius;
	}
	Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public String toString(){
		return "radius:"+radius;
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
}

