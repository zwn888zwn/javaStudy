package shangke;

import java.util.Arrays;

public class copy {
	public static void main(String[] args) {
	int[] a={1,2,3,9,8,6,5};
	int[] b=new int[10];
	int[] c=new int[10];
     for(int i=0 ;i<a.length;i++)
    	 b[i]=a[i];
     c=Arrays.copyOf(a, a.length);
     for(int x:a)
    	 System.out.print(x+" ");
     System.out.println();
     for(int x:b)
    	 System.out.print(x+" ");
     System.out.println();
     for(int x:c)
    	 System.out.print(x+" ");
     System.out.println();
	}

}
