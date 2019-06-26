package BLUE;
import java.util.Scanner;
import java.util.Stack;

public class 前缀表达式 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Stack stack=new Stack();
		String s=scan.nextLine();
		String[] zu=s.split(" ");
		for(String x:zu)
			stack.push(x);
	while(true){
			int num2=Integer.parseInt(stack.pop().toString());
			if(stack.isEmpty()){
				System.out.println(num2);
				return;
			}
			int num1=Integer.parseInt(stack.pop().toString());
			String fuhao=(String) stack.pop();
			if(fuhao.equals("+"))
				stack.push(num1+num2);
			else if(fuhao.equals("-"))
				stack.push(num1-num2);
			else if(fuhao.equals("*"))
				stack.push(num1*num2);
			else
				stack.push(num1/num2);
		}
	}

}
