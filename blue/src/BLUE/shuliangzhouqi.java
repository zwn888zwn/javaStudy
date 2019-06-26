package BLUE;

public class shuliangzhouqi {

	public static void main(String[] args) {
		double x=0.5;
		double r=3.62;
		for(int i=0;i<100;i++){
			x=x*(1-x)*r;
			System.out.println(x);
		}
	}

}
