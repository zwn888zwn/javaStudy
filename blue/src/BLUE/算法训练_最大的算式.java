package BLUE;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class 算法训练_最大的算式 {
	static int max=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Vector v=new Vector();
		Vector fuhao=new Vector();
		int i=scan.nextInt();
		int k=scan.nextInt();
		for(int p=0;p<i;p++)
			v.add(scan.nextInt());
		for(int p=0;p<k;p++)
		fuhao.add(0);//*
		for(int p=0;p<(i-k);p++)
			fuhao.add(1);//+
		System.out.println(System.currentTimeMillis());
		cal(v,fuhao);
		System.out.println(max);
		System.out.println(System.currentTimeMillis());
	}
	public static void cal(Vector v,Vector fuhao){
		if(v.size()==1){
			if(max<(Integer)v.get(0))
				max=(Integer)v.get(0);
			return;
		}
		for(int i=0;i<v.size()-1;i++){

				if(fuhao.contains(0)){
					Vector v1=new Vector(v);
					Vector fu=new Vector(fuhao);
					int a=(Integer)v1.remove(i);
					int b=(Integer)v1.remove(i);
					v1.add(i, a*b);
					fu.remove(new Integer(0));
					cal(v1,fu);
				}
				else{
					int maxT=0;
					for(int p=0;p<v.size();p++){
						maxT+=(Integer)v.get(p);
					}
					if(max<maxT)
						max=maxT;
					return;
					
				}
				if(fuhao.contains(1)){
					Vector v1=new Vector(v);
					Vector fu=new Vector(fuhao);
					int a=(Integer)v1.remove(i);
					int b=(Integer)v1.remove(i);
					v1.add(i, a+b);
					fu.remove(new Integer(1));
					cal(v1,fu);
				}
			
		}
	}

}
