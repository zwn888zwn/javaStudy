package shangke;
import java.util.*;

public class StringArray {
	public static void main(String[] args) {
	    int[] a={34,12,76,1,89};
	    int[] b=new int[10];
	    for(int i=0;i<a.length;i++){
	    	System.out.print(a[i]+" ");
	    }
	    System.out.println();
	    for(int x:a)
	    	System.out.print(x+" ");
	    System.out.println();
     System.out.println(Arrays.toString(a));
     System.arraycopy(a,2, b, 4, 3);
     System.out.println(Arrays.toString(b));
	}

}
