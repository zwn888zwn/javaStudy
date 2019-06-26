package BLUE;

import java.util.Scanner;

public class xinyongka {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String ka=scan.nextLine().trim();
		if((getjishuhe(ka)+getoushuhe(ka))%10==0)
			System.out.println("³É¹¦");
		else
			System.out.println("Ê§°Ü");

	}
	public static int  getjishuhe(String ka){
		int sum=0;
		int  s;
		for(int i=ka.length()-1;i>=0;i--){
			s=ka.charAt(i)-48;
			if(i%2!=0)
				sum+=s;
		}
		return sum;
		
	}
	public static int  getoushuhe(String ka){
		int sum=0;
		int  s;
		for(int i=ka.length()-1;i>=0;i--){
			s=ka.charAt(i)-48;
			if(i%2==0){
				s*=2;
				if(s>=10)
					s-=9;
				sum+=s;
			}
		}
		return sum;
	}

}
