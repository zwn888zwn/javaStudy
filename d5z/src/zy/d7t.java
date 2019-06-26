package zy;

import java.util.Scanner;

public class d7t {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("请输入一个10进制的整数,程序会自动转换数值为二进制");
	int x=s.nextInt();
	String b="";
	while(x>0){
		if(x%2==0)
			b=b+"0";
		else
			b=b+"1";
		x=x/2;
	}
	StringBuffer reverseStr = new StringBuffer(b).reverse();
	System.out.println(reverseStr);
	}


	}


