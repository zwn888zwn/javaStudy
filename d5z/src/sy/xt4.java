package sy;

public class xt4 {
	public static void main(String[] args) {
		int i ,n=0;
		for( i=100;i<=200;i++){
			if (i%5==0^i%6==0){
				System.out.print(i+" ");
				n++;
				if (n%10==0)
					System.out.println();
			}
			/*if (n%10==0)
				System.out.println();*/
		}

	}

}
