package d4_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ÉÔ´óµÄ´® {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		for(int i=str.length()-1;i>1;i--){
			if(str.charAt(i)<=str.charAt(i-1)){
				continue;
			}
			else{
				System.out.println(str.substring(0, i-1)+str.charAt(i)+str.charAt(i-1)+str.substring(i+1));
				return;
			}
				
		}
		ArrayList<Character> al=new ArrayList<Character>();
		for(int i=0;i<str.length();i++){
			al.add(str.charAt(i));
		}
		Collections.sort(al);
		al.remove((Character)str.charAt(str.length()-1));
		al.add(0,str.charAt(str.length()-1));
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i));
		}

	}

}
