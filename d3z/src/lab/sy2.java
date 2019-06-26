package lab;

import java.util.Scanner;

public class sy2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入字符串");
		String wen=scan.next();
		if(isPalindrome(wen)){
			System.out.println(wen+"是回文串");
		}
		else
			System.out.println(wen+"不是回文串");

	}
	static boolean isPalindrome(String s){
		int a=0,b=s.length()-1;
		boolean f=true;
		char[] zu=new char[s.length()];
		for(int i=0;i<zu.length;i++){
			zu[i]=s.charAt(i);
		}
		                   
		for(int i=0;i<=s.length()/2;i++){
			if(zu[a]==zu[b]){
				a++;
				b--;
			}
			else
				f=false;
			
			
		}
			return f;
		
	}

}
