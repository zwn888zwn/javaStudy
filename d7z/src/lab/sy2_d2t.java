package lab;

import java.util.Arrays;

public class sy2_d2t {

	public static void main(String[] args) {
	System.out.println(Max(5,6,7,8,3,4));

	}
	public static int Max(int...n){
		Arrays.sort(n);		
		return n[n.length-1];
	}

}
