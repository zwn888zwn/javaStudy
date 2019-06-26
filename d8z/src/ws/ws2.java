package ws;

import java.util.Arrays;

public class ws2 {
	public static void main(String[] args) {
		int[] a={1,4,6,1,2,5,8};
		for(int i=0;i<a.length;i++){
			int x,k;
			k=(int)(Math.random()*a.length);
			x = a[k];
			a[k] = a[i];
			a[i] = x;
		}
		System.out.println(Arrays.toString(a));

	}

}
