package lab;

import java.util.Arrays;

public class sy1_2 {
	public static void main(String[] args) {
	   sort(45,77,22);

	}
	public static void sort(int num1,int num2,int num3){
		int[] zu=new int[3];
		zu[0]=num1;
		zu[1]=num2;
		zu[2]=num3;
		Arrays.sort(zu);
		System.out.println(Arrays.toString(zu));
	}

}
