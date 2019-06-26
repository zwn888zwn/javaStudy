package d4_10;

public class d4_10 {
	static long count=0;
	public static void main(String[] args) {
		digui(39,0);
		System.out.println(count);
		System.out.println(f(39));
	}
	public static void digui(int left,int bu){
		if(left>=0){
		if(left==0&&bu%2==0){
			count++;
		}
		digui(left-1,bu+1);
		digui(left-2,bu+1);
		}
	}
	static int f(int n)
	{
		if(n==1) return 0;
		if(n==2) return 1;
		//if(n==3) return 2;
		
		return g(n-1) + g(n-2);
	}
	static int g(int n)
	{
		if(n==1) return 1;
		if(n==2) return 1;
		
		return f(n-1) + f(n-2);
	}
	

}
