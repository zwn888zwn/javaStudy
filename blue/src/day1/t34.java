package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class t34 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int max=scan.nextInt();
		int n=scan.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			al.add(scan.nextInt());
		Collections.sort(al);
		int first=0;
		int last=al.size()-1;
		while(last>first){
			if(al.get(last)+al.get(first)<=max){
				al.set(last, al.get(last)+al.get(first));
				al.remove(first);
				last--;
			}
			else
				last--;
			
		}
		System.out.println(al.size());

	}

}
