package day1;

import java.util.Scanner;
import java.util.*;

public class t21 {
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		int v=scan.nextInt();
		int num=scan.nextInt();
		Vector tree=new Vector();
		int[][] zu=new int[num][num];
		for(int i=0;i<num;i++)
			tree.add(scan.nextInt());
		Collections.sort(tree);
		for(int i=0;i<num;i++){
			zu[0][i]=(Integer)tree.remove(tree.size()-1);
		}
		digui(zu,v);
		System.out.println(min);
		
		
	}
	public static void digui(int [][] zu,int left){
		if(left==0){
			min=0;
			return;
		}
			for(int i=0;i<zu[0].length;i++){
				if(left-zu[0][i]>=00&&zu[1][i]!=1){
					zu[1][i]=1;
					min=Math.min(min, left-zu[0][i]);
					digui(zu,left-zu[0][i]);
				}
					zu[1][i]=0;
				
			}

	}

}
