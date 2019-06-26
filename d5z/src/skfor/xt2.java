package skfor;

import java.util.Scanner;

public class xt2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double a=0,sum=0,average=0,i=0;
		System.out.println("输入成绩（输入-100时结束）");
		while(true){
			if(a==-100)		
				break;
			
			a=s.nextDouble();
			sum+=a;
			i++;
		
		}
		average=sum/i;
			System.out.println("人数"+(i-1)+"总分"+sum+"平均分"+average);

	}

}
