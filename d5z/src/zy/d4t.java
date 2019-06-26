package zy;

import java.util.Scanner;

public class d4t {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k;
		System.out.println("输入一个1-15的整数");
		int i=s.nextInt();
		for(k=1;k<=i;k++){
			for(int j=i-1;j>=k;j--)
				if(j>=9)
				System.out.print("   ");
				else 
				System.out.print("  ");
			for(int x=k;x>=1;x--)
				System.out.print(x+" ");
			for(int y=2;y<=k;y++)
				System.out.print(y+" ");
			System.out.println();
		}

	}

}
