package day1;

import java.util.Scanner;

public class t2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n%2!=0){
			System.out.println(n*(n-1)*(n-2));
		}
		else{
			if(n%3==0)
				System.out.println((n-1)*(n-2)*(n-3));
			else
				System.out.println((n)*(n-1)*(n-3));
		}

	}

}
