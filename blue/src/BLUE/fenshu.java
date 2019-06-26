package BLUE;

import java.util.Vector;

public class fenshu {
	static Vector book,AL,BL,CL,A,B,C;
	static int b=5;
	public static void main(String[] args){
		A=new Vector();
		B=new Vector();
		C=new Vector();
		AL=new Vector();
		BL=new Vector();
		CL=new Vector();
		book=new Vector();
		for(int i=1;i<=5;i++)
			book.add(i);
		AL.add(1);
		AL.add(2);
		BL.add(1);
		BL.add(5);
		CL.add(2);
		CL.add(3);
		CL.add(4);
		sort(0);
	}
	public static void sort(int p){

		if(A.size()>0&&C.size()>0&&B.size()>0){
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);
			System.out.println("--------------------");
			return;
		}
			
		for(int i=0;i<book.size();i++){
			if(AL.contains(book.get(i))){
				Integer temp=(Integer) book.remove(i);
				A.add(temp);
				sort(p+1);
				book.add(i,A.remove(A.indexOf(temp)));
			}
			if(BL.contains(book.get(i))){
				Integer temp=(Integer) book.remove(i);
				B.add(temp);
				sort(p+1);
				book.add(i,B.remove(B.indexOf(temp)));
			}
			if(CL.contains(book.get(i))){
				Integer temp=(Integer) book.remove(i);
				C.add(temp);
				sort(p+1);
				book.add(i,C.remove(C.indexOf(temp)));
			}
		}
	}

}
