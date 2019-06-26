package example;

public class a1_13 {
	public static void main(String[] args) {
		double a=Math.round(Math.PI*100)/100.0;
		System.out.println(a);
		int b=(int)Math.round(Math.PI*100);
		System.out.println(rint(-5.1));
		System.out.println(Math.rint(-5.1));

	}
	static int abs(int a){
	 if(a>=0)
		return a;
	 else
		 return -a;
	}
	static double abs(double a){
		if(a>=0)
			return a;
		else
			return -a;
	}
	static double rint(double a){
		double x ,b;
		b=a;
		if(a<0)
			a=-a;
		double a0=(int)a;
		double a1=(int)(a+1);
		if(a1-a>a-a0)
			x= a0;
		else if(a1-a<a-a0)
			x= a1;
		else 
			x= a0%2==0?a0:a1;
		if(b>=0)
			return x;
		else 
			return (x*(-1));
	}

}
