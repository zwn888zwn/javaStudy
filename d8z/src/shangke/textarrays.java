package shangke;

public class textarrays {
	public static void main(String[] args) {
		int[] a= {11,2,7,3,5,8};
		System.out.println("‘≠–Ú¡– «");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		int x=a[0];
         for(int i=1;i<a.length-1;i++)
		   a[i-1]=a[i];
		a[5]=x;
		for(int p:a)
			System.out.print(p+" ");
	}

}
