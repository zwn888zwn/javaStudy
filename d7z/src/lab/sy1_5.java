package lab;

import java.util.Scanner;

public class sy1_5 {
	public static void main(String[] args) {
		System.out.println("ÊäÈëÊı");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String timu="";
		for(int k=1;k<=n;k++){
			timu+=k+"/"+(k+1)+"+";
		}
		timu=timu.substring(0,timu.length()-1);
		System.out.println(timu+"="+m(n));

	}
	public static double m(int i){
		double sum=0;
		for(int k=1;k<=i;k++){
			sum+=(double)k/(k+1);
		}
		return sum;
	}

}
