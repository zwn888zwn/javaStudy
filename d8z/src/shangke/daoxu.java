package shangke;

import java.util.Arrays;

public class daoxu {
	public static void main(String[] args) {
		int[] a= {11,2,7,3,5,8};
		int[] b= {11,2,7,3,5,8};
		System.out.println("‘≠–Ú¡– «");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		for(int i=0;i<a.length;i++)
		   a[i]=b[b.length-1-i];
		for(int x:a)
			System.out.print(x+" ");
		System.out.println(Arrays.asList(a));
	}

}
