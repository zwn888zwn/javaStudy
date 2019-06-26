package example;

import java.util.Scanner;

public class textSubstring {
	public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 System.out.println("请输入一个字符串");
	 String s=input.next();
	 String s1=s.substring(s.length()-1);
	 //char s2=s.charAt(s.length()-1);
	 System.out.println(s+"的字符串的最后一个字符是"+s1);
//右移一位
	 s1=s.substring(0,s.length()-1);
	 String s3=s.substring(s.length()-1);
	 String s4=s3+s1;
	 System.out.println("右移一位是"+s4);
	 //左移
	 String sMoveLeft=s.substring(1)+s.substring(0,1);//+s.charAt(0)
	 System.out.println(sMoveLeft);
	 //倒序
	 System.out.println(reverse(s));
	}
	public static String reverse(String s){
	String s1="";
		for(int i=s.length()-1;i>=0;i--){
			s1+=s.charAt(i);
		}
		return s1;
		
		
	}
	
	}


