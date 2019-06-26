
public class chu0 {

	public static void main(String[] args) {
		try{
			int a=10,b=0;
			double c=a/b;
			System.out.println(a+"/"+b+"="+c);
			}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("除数不能为0");
			return;
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("结束");
		}
		System.out.println("aaaaaaa");
	}

}
