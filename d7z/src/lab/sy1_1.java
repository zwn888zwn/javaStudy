package lab;

import java.util.Scanner;

public class sy1_1 {
	public static void main(String[] args) {
		System.out.println("ÊäÈëÊı");
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		System.out.println(sumDigits(n));

	}
	public static int sumDigits(long n){
		int s=0;
		while(n!=0){
			s+=n%10;
			n=n/10;		
		}
		return s;
		
	}

}
