package ws;

public class d2t {
	public static void main(String[] args) {
	for(int i=1;i<=9;i++){
		for(int j=i;j>=1;j--)
			System.out.print(" ");
		for(int k=i;k<=9;k++)
			System.out.print(k);
		for(int x=8;x>=i;x--)
			System.out.print(x);
		System.out.println("\n");
	}

	}

}
