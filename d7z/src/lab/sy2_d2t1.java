package lab;

public class sy2_d2t1 {

	public static void main(String[] args) {
	System.out.println(MAX(3,4,5,6,2,1));

	}
	public static int MAX(int...n){
		int max=n[0];
		for(int i=1;i<n.length;i++){
			if(n[i]>max){
				max=n[i];
			}
		}
		return max;
		
	}

}
