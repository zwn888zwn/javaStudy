package BLUE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LuckyNum {

	public static void main(String[] args) {
		
		boolean[] zu=new boolean[1000];
		Arrays.fill(zu, true);
		zu[0]=false;
		removeL(zu,2);
		for(int i=2;i<zu.length;i++){
			removeL(zu,getL(zu,i));
		}
		printzu(zu);
		System.out.println();
		tongji(zu,30,69);

	}
	public static void removeL(boolean[] zu,int luck){
		int a=0;
		for(int i=0;i<zu.length;i++){
			if(zu[i]==false)
				continue;
			a++;
			if(a==luck){
				zu[i]=false;
				a=0;
			}
		}
	}
	public static int getL(boolean[] zu,int NO){
		int a=0;
		for(int i=0;i<zu.length;i++){
			if(zu[i]==false)
				continue;
			a++;
			if(a==NO){
				return i;
				
			}
		}
		return 0;
	}
	public static void printzu(boolean[] zu){
		for(int i=0;i<zu.length;i++){
			if(zu[i]==true)
				System.out.print(i+" ");
		}
	}
	public static void tongji(boolean[] zu,int start,int end){
		int count=0;
		for(int i=start+1;i<end;i++){
			if(zu[i]==false)
				continue;
			count++;
				
			}
		System.out.println(count);
		}
	

}
