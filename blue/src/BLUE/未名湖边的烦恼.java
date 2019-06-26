package BLUE;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Î´Ãûºþ±ßµÄ·³ÄÕ {
	static int count=0;
	 static HashSet hs=new HashSet();
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		Vector v1=new Vector();
		Vector v2=new Vector();
		for(int i=0;i<m;i++)
			v1.add(1);
		for(int i=0;i<n;i++)
			v1.add(-1);
		run(v1,v2);
		Iterator it=hs.iterator();
	while(it.hasNext()){
			Vector v=(Vector) it.next();
			int sum=0;
			for(int i=0;i<v.size();i++){
				sum+=(Integer)v.get(i);
				if(sum<0){
					count--;
					break;
				}
			}
			count++;
		}
		System.out.println(count);
	}
	public static void run(Vector v1,Vector v2){
		if(v1.size()==0){
			//System.out.println(v2);
			hs.add(v2);
			return ;
		}

		for(int i=0;i<v1.size();i++){
			Vector v10=new Vector(v1);
			Vector v20=new Vector(v2);
			v20.add(v1.get(i));
			v10.remove(i);
			run( v10,v20);
		}
	}

}
