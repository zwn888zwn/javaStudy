package d4_10;
// ����
// ����

public class A
{
	// x: ����ʣ�����  
	// y: ���� ...
	static int f(int x, int y)
	{
		if(x==0 || y==0) return 1;
		return f(x-1,y) + f(x,y-1);
	}
	

	public static void main(String[] args)
	{
		System.out.println(f(4,3));
	}
}