package example;

public class OverLoadMethod {
	public static void main(String[] args) {
	    int  i=10;
		int j=20;
		System.out.println(max(i,j));

	}
	public static int max(int x,int y){
		if(x>y)
			return x;
		else
		    return y;
	}
	public static double max(double x,double y){
		if(x>y)
			return x;
		else
		    return y;
	}
	public static char max(char x,char y){
		if(x>y)
			return x;
		else
		    return y;
	}
	
	}

