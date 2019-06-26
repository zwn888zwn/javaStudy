package d4_10;

public class 取球MN {

	public static void main(String[] args) {
		System.out.println(f(5,2));

	}
	public static int f(int m,int n){
		if(m<n) return 0;
		if(n==0)
			return 1;
		return f(m-1,n-1)+f(m-1,n);//这个球取了  这个球没取
	}

}
