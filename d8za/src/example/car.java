package example;

public class car {
	double price;
	int speed;
	String name;
	car(String name,double price){
	this.name=name;
	this.price=price;
	}
	car(String name,double price,int speed){
		this.name=name;
		this.price=price;
		this.speed=speed;
	}
	void speedUp(int s){
	   speed=s;	
	}
	void stop(){
		speed=0;
	}

}
