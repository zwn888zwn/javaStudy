package example;

public class PrimeNumbers {
	public static void main(String[] args) {
		int p=0;
		for(int i=2;p<50;i++){
			if(isPrime(i)){
				System.out.print(i+"\t");
				p++;
				if(p%10==0)
					System.out.println();
			}
		}

	}
	public static boolean isPrime(int n){
		for(int i=2;i<=(int)Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
