package example;

public class sortEX {
	static int[] zu={1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		new sortEX().sort(zu, 0);

	}
	public static void print(int[] zu){
		for(int i=0;i<zu.length;i++){
			System.out.print(zu[i]+" ");
		}
		System.out.println();
	}
	public static void sort(int[] zu,int k){
		if(k==zu.length){
			print(zu);
			return;
		}
		for(int i=k;i<zu.length;i++){
			int temp=zu[i];
			zu[i]=zu[k];
			zu[k]=temp;
			sort(zu,k+1);
			 temp=zu[k];
				zu[k]=zu[i];
				zu[i]=temp;
		}
	}

}
