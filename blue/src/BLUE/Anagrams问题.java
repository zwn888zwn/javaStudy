package BLUE;

import java.util.Scanner;

public class AnagramsŒ Ã‚ {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] zu1=new int[26];
		int[] zu2=new int[26];
		String s1=scan.next().toLowerCase();
		String s2=scan.next().toLowerCase();
		for(int i=0;i<s1.length();i++){
			zu1[s1.charAt(i)-'a']++;
			zu2[s2.charAt(i)-'a']++;
		}
		for(int i=0;i<zu1.length;i++){
			if(zu1[i]!=zu2[i]){
				System.out.println("N");
				return;
			}
		}
		System.out.println("Y");
	}

}
