package lab;

import java.util.Arrays;
import java.util.Scanner;

public class sy3 {
	public static void main(String[] args) {
		System.out.print("请输入当前单号");
		Scanner scan=new Scanner(System.in);
		String dan=scan.next();
		String s1=dan.substring(0,15);
		String s2=dan.substring(15);
		int hao=Integer.parseInt(s2);
		hao++;
		s2=hao+"";
		char[] zu=new char[5];
		Arrays.fill(zu, '0');
		int a=4;
		for(int i=s2.length()-1;i>=0;i--){
			 
			zu[a]=s2.charAt(i);
			a--;
		}
		String s3=new String(zu);
		System.out.println("新单号为"+s1+s3);

	}

}
