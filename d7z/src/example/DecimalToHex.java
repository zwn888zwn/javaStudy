package example;

import java.util.Scanner;

public class DecimalToHex {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个十进制整数");
		int n =s.nextInt();
		String sHex =decimalToHex(n);
		System.out.println("十进制数"+n+"的十六进制数是"+sHex);

	}
	public static String decimalToHex(int n){
		String sHex="";
		while(n>0){
			sHex=getHexChar(n%16)+sHex;
			n=n/16;
			
		}
		return sHex;
	}
	public static char getHexChar(int n){
	
		if(n>=10)
			return (char)(n-10+'a');
		else
			return (char)(n+48);
		
	
	}

}
