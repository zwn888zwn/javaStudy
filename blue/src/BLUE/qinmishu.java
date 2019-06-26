package BLUE;

import java.util.Arrays;

public class qinmishu {

	public static void main(String[] args) {
		for(int i=1;i<100000;i++){
			int k=obtain(i);
			if(obtain(k)==i&&k!=i){
				System.out.println(i+"   "+obtain(i));
				i=k;
			}
		}
		
	}
	public static int obtain(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}


}
