package lab;

import java.util.Scanner;

public class sy4 {
	public static void main(String[] args) {
		System.out.println("���������ַ���");
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		char[] zu1=new char[s1.length()];
		char[] zu2=new char[s2.length()];
		for(int i=0;i<s1.length();i++){
			zu1[i]=s1.charAt(i);
			zu2[i]=s2.charAt(i);
		}
		int max=0,n=0;
		for(int i=0;i<s1.length();i++ ){
		
		if(zu1[i]==zu2[i])
			n++;
		if(zu1[i]!=zu2[i])
			n=0;
		if(max<=n){
			max=n;
		}
		}
		System.out.println(max+"��");

	}

}
