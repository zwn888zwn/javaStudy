package shangke;

public class paixu {
	public static void main(String[] args) {
		int a=0;
		int[] x={15,34,85,11,12,17,5,3,18,4};
		for(int j=1;j<x.length;j++){
		   for(int i=j;i<x.length;i++)
			if(x[j-1]<x[i]){
				a=x[j-1];
				x[j-1]=x[i];
				x[i]=a;
			}
		}
		for(int k:x)
			System.out.print(k+" ");
	}

}
