
public class chu0 {

	public static void main(String[] args) {
		try{
			int a=10,b=0;
			double c=a/b;
			System.out.println(a+"/"+b+"="+c);
			}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("��������Ϊ0");
			return;
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("����");
		}
		System.out.println("aaaaaaa");
	}

}
