package example;

public class TextMethod {
	public static long jiec(int n){
		long f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		return  f;
	}
	 public static void main(String[] args) {
	 // sum=jiec(10)+jiec(6)-jiec(9);
	 int x=1,y=2,z;
	   z=Max(x,y);
	System.out.println(z);
	judgeEven(x);
	judgeEven(y);
	System.out.println(getUpperCase('b'));
	}
        public static int Max(int num1,int num2){
        	int max;
        	if(num1>num2)
        		max=num1;
        	else
        		max=num2;
        	return max;
        }
        public static boolean isEven(int n){
        	if(n%2==0)
        		return true;
        	else
        		return false;
        }
        public static void judgeEven(int n){
        	if(n%2==0)
        		System.out.println(n+" is an even number");
        	else
        		System.out.println(n+" is not an even number");
        }
        public static char getUpperCase(char c){
        	return (char)(c-32);
        	
        }
       
        
}
