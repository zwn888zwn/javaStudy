package example;

public class fact {
	public static void main(String[] args) {
	System.out.println("5!="+fact(5));	
	}
    public static long fact(int n){
    	if(n==1)
    		return 1;
    	else
    		return fact(n-1)*n;
    }
    public static int sum(int n){
    	if(n==1)
    		return 1;
    	else
    		return  sum(n-1)+n;
    }
}
