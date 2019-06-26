package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class 最长回文子串 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		s=s.trim();
		int[][] zu=new int[s.length()+1][s.length()+1];
		for(int i=1;i<=s.length();i++)
			zu[i][i]=1;
		for(int i=1;i<s.length();i++)
			if(s.charAt(i-1)==s.charAt(i))
				zu[i][i+1]=2;
			else
				zu[i][i+1]=1;
		for(int i=2;i<=s.length();i++){
			for(int k=1;k+i<=s.length();k++){
				if(s.charAt(k-1)==s.charAt(k+i-1)){
					zu[k][k+i]=zu[k+1][k+i-1]+2;
				}
				else
					zu[k][k+i]=Math.max(zu[k+1][k+i], zu[k][k+i-1]);
			}
		}
		System.out.println(zu[1][s.length()]);
/*		for(int i=0;i<zu.length;i++){
			for(int k=0;k<zu.length;k++){
				System.out.print(zu[i][k]);;
			}
			System.out.println();
		}*/
		//输出
		ArrayList al=new ArrayList();
		int max=zu[1][s.length()];
		for(int i=s.length();i>=0;i--){
			if(zu[1][i]==max){
				continue;
			}
			else{
				max=zu[1][i];
				al.add(s.charAt(i));
			}
			if(max==1){
				al.add(s.charAt(i-1));
				break;
			}
		}
		if(zu[1][s.length()]%2==0){
			for(int i=0;i<al.size()-1;i++){
				System.out.print(al.get(i));
			}
			for(int i=1;i<al.size();i++){
				System.out.print(al.get(al.size()-i-1));
			}
		}
		else{
			for(int i=0;i<al.size();i++){
				System.out.print(al.get(i));
			}
			for(int i=al.size()-2;i>=0;i--){
				System.out.print(al.get(i));
			}
			
		}
		

	}

}
