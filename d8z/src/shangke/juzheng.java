package shangke;

import java.util.Arrays;

public class juzheng {
	public static void main(String[] args) {
		int[][] a={{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7},{5,6,7,8}};
		int sum=0;
		int[] b=new int[4];
		for(int k=0;k<a[k].length;k++){
			int s=0;
			for(int i=0;i<a.length;i++){
				s+=a[i][k];
				b[k]=s;
			}
		}
		for(int j=0;j<b.length;j++)
			sum+=b[j];
		System.out.println("列和"+Arrays.toString(b));
        System.out.println("所有元素和"+sum);
	}

}
