package lab;

import java.util.Scanner;

public class sy2_d3t {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ÊäÈënµÄÖµ");
	int n=s.nextInt();
    System.out.println(qiuhe(n));
    
	}
	public static int qiuhe(int n){
		if(n==1)
			return 1;
		else
			return qiuhe(n-1)+n;	
	}

}
