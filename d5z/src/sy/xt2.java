package sy;

import java.util.Scanner;

public class xt2 {
	public static void main(String[] args) {
		int n,course,max=0;
		Scanner s=new Scanner(System.in);
		String xm,xmmax="";
		System.out.print("������ѧ������");
		n=s.nextInt();
       for(int i=1;i<=n;i++){
    	   System.out.println("����ѧ���������ɼ�");
    	   xm=s.next();
    	   course=s.nextInt();
    	   if(course>max){
    		   max=course;
    		   xmmax=xm;
    	   }
       }
       System.out.println("�ɼ���ߵ�ѧ���ǣ�"+xmmax);
	}

}
