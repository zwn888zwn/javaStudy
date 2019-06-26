package BLUE;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Î´Ãûºþ±ßµÄ·³ÄÕ2 {
	static int count=0;
	static int all=0;
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		all=m+n;
		Vector v1=new Vector();
		for(int i=0;i<m;i++)
			v1.add(1);
		for(int i=0;i<n;i++)
			v1.add(-1);
		run(v1,0,0);
		System.out.println(count);
	}
	public static void run(Vector v1,int sum,int ceng){
		if(ceng==all){
			count++;
			return;
		}
		if(v1.contains(1)&&(sum+1)>=0){
			Vector v10=new Vector(v1);
			int temp=sum;
			v10.remove(new Integer(1));
			temp+=1;
			 run(v10,temp,ceng+1);
		}
		if(v1.contains(-1)&&(sum-1)>=0){
			Vector v10=new Vector(v1);
			int temp=sum;
			v10.remove(new Integer(-1));
			temp-=1;
			run(v10,temp,ceng+1);
		}

	}

}
