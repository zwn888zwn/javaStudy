package skfor;
import java.util.Scanner;
public class gongyueshu {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("输入2个整数");
	/*int a,b,c=0;
		a=s.nextInt();
		b=s.nextInt();
		for(int i=1;i<=a;i++){
			if(a%i==0&&b%i==0)
				c=i;
		}
       System.out.println("最大公约数"+c);  */
		int a,b, m,n,r;
		a=s.nextInt();
		b=s.nextInt();
		//if(a>b){
			m=a;
		    n=b;
		/*}else{
			n=a;	
		    m=b;
		}  */
	  while(true){
		  r=m%n;
       if (r!=0){
    	   m=n;
		   n=r;
	  }
       else
    	   break;
	  }
		  System.out.println(n);
	}

}
