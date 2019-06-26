package example;

public class TestInterface {
	public static void main(String[] args){
		eat(new Chicken());
		
	}
	public static void eat(Edible e){
		System.out.println(e.howToEat());
	}

}
class Animal extends Thread{

}
class Chicken extends Animal implements Edible,Runnable{
	public void run(){
		System.out.println("Á½ÌõÍÈÅÜ");
	}
	public String howToEat(){
		return "Õ¨×Å³Ô";
	}
	
}
class Pig extends Animal implements Edible,Runnable{
	public void run(){
		System.out.println("4ÌõÍÈÅÜ");
	}
	public String howToEat(){
		return "ºìÉÕ";
	}
}