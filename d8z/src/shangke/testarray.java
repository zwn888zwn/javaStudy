package shangke;

import java.util.Scanner;

public class testarray {
	public static void main(String[] args) {
		double[] course=new double[9];
		double sum=0,aver=0,max=0;
		int n=0,xuhao=0;
		Scanner s=new Scanner(System.in);
		System.out.println("������10��ѧ���ɼ�:");
		for(int i=0;i<course.length;i++){
           /*course[i]=((int)(Math.random()*100*10)/10.0);
		   System.out.print(course[i]+" ");*/
			course[i]=s.nextDouble();
		}
		for(int i=0;i<course.length;i++){
			 sum+=course[i];
		}
		//aver=Math.round(sum/course.length*10)/10.0;
		//System.out.print("����"+(aver));
		for(int i=0;i<course.length;i++){
			 if(course[i]>=60){
				 n++;
			 }	 
		}
		for(int i=0;i<course.length;i++){
			 if(course[i]>=max){
				 max=course[i];
				 xuhao=i;
			 }
				 
				 
		}
		System.out.println("��������"+n+"��");		
		System.out.println("������"+(n/10.0*100)+"%");	
		}
	}


