package skfor;

import java.util.Scanner;

public class xt2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double a=0,sum=0,average=0,i=0;
		System.out.println("����ɼ�������-100ʱ������");
		while(true){
			if(a==-100)		
				break;
			
			a=s.nextDouble();
			sum+=a;
			i++;
		
		}
		average=sum/i;
			System.out.println("����"+(i-1)+"�ܷ�"+sum+"ƽ����"+average);

	}

}
