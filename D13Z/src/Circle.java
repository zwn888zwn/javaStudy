

public class Circle {
	private double radius;
	Circle(double radius)  {
	  if(radius>=0)	
		this.radius=radius;
	  else{
		  throw new yichang("�뾶����Ϊ��");
	  }
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius) {
		if(radius>=0)	
			this.radius=radius;
		  else{
			  throw new yichang("�뾶����Ϊ��");
		  }
	}
	public String toString(){
		return "�뾶:"+radius;
	}
	public static void main(String[] args) {
		 try{
			 Circle c1=new Circle(-1);
		 }catch(yichang e){
			 e.printStackTrace();
		 }
	}

}
class yichang extends RuntimeException{
	yichang(){
		super();
	}
	yichang(String s){
		super(s);
		
	}
}
