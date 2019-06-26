package sy;

import java.util.Arrays;
import java.util.Scanner;
//输入一个整数N 求小于这个整数的所有质数
public class d5tt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("输入一个数");
		int a = s.nextInt();
		boolean[] zu = new boolean[a+1];
		Arrays.fill(zu, true);
		zu[0]=false;
		zu[1]=false;
		for(int i=2;i<=a;i++){
			if(zu[i])
				for(int k=2;k*i<=a;k++)
					zu[k*i]=false;
		}
		for (int j = 1; j < zu.length; j++)
			if (zu[j])
				System.out.print(j  + " ");
	}

}
