package zy;

import java.util.Scanner;

public class d5t {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("����һ������,�������������ʾ����������С����");
		int i=s.nextInt();
		int t;
		for(t=2;t<=i;t++){
			if(i%t==0){
			i=i/t;
			System.out.print(t+" ");
			t--;
			
		}
			

	}

}
}