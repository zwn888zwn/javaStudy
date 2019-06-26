package d4_10;

import java.util.ArrayList;
import java.util.Scanner;

public class ÅÅÁĞĞòÊı {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int[] zu=new int[11];
		zu[0]=1;
		ArrayList<Character> al=new ArrayList<Character>();
		for(int i=1;i<s.length();i++){
			zu[i]=zu[i-1]*i;
		}
		for(int i=0;i<s.length();i++){
			al.add((char)('a'+i));
		}
		long save=0;
		for(int i=0;i<s.length()-1;i++){
			
			save+=(al.indexOf(s.charAt(i)))*zu[s.length()-1-i];
			al.remove(al.indexOf(s.charAt(i)));
		}
		System.out.println(save);

	}

}
