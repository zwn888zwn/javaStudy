package skfor;

public class feibonaqi {
	public static void main(String[] args) {
	int a=1,b=1,c;
	System.out.print(a+" "+b+" ");
	for(int i=3;i<=20;i++){
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
	}
		

	}

}
