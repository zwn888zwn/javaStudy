package skfor;

import java.util.Scanner;

public class l5 {
	public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
	     System.out.println("输入一个大于2的整数");
	     int n=s.nextInt();
	     boolean f = false;
	     for(int i=2;i<=(n-1);i++){
	    	 if(n%i==0){
	    		 f=false;
	    		 break;
	    	 }else
	    		f=true;
	     }
    System.out.println(f);
	}

}
