package sy;

import java.util.Scanner;

public class xt2 {
	public static void main(String[] args) {
		int n,course,max=0;
		Scanner s=new Scanner(System.in);
		String xm,xmmax="";
		System.out.print("请输入学生人数");
		n=s.nextInt();
       for(int i=1;i<=n;i++){
    	   System.out.println("输入学生姓名，成绩");
    	   xm=s.next();
    	   course=s.nextInt();
    	   if(course>max){
    		   max=course;
    		   xmmax=xm;
    	   }
       }
       System.out.println("成绩最高的学生是："+xmmax);
	}

}
