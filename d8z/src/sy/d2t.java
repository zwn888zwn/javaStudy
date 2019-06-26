package sy;

import java.util.Arrays;
import java.util.Scanner;

public class d2t {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ÊäÈëNµÄÖµ");
		int n=s.nextInt();
		int[] a1=new int[n+1];
		int[] a2=new int[n+1];
		int[] a3=new int[n+1];
		a1[0]=a2[0]=1;
		System.out.println("1");
		for(int k=1;k<n;k++){
			for(int j=1;j<=k;j++){
				a2[j]=a1[j-1]+a1[j];
			}
			for(int p=0;p<k+1;p++){
				System.out.print(a2[p]+" ");
			}
			System.out.println();
			
		
			a3=Arrays.copyOf(a2, a2.length);
			a2=Arrays.copyOf(a1, a1.length);
			a1=Arrays.copyOf(a3, a3.length);
		}

	}
}

