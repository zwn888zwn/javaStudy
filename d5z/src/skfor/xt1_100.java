package skfor;

public class xt1_100 {
	public static void main(String[] args) {
	int m=0;
		for(int i=1;i<=100;i++){
		if(i%5==0||i%6==0) continue;
		System.out.print(i+" ");
		m++;
		if(m%5==0)
			System.out.println();
		
	}

	}

}
