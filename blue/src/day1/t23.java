package day1;

import java.util.Scanner;

public class t23 {
	static int count=0;
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int k=scan.nextInt();
			digui(n,k,-1);
			System.out.println(count);

	}
	public static void digui(int num,int fen,int last){

		if(fen==1){
			if(last<=num){
				count++;
			}
			return;	
		}
		for(int i=1;i<=num;i++){

			if(last<=i)
			digui(num-i,fen-1,i);
		}
	}

}
