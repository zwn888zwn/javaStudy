import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Execrise25_8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(process(scan.nextLine()));
		//System.out.println(process("2 1 3 + *"));

	}
	public static double process(String exp){
		Stack<Double> numS=new Stack<Double>();
		StringTokenizer tokens=new StringTokenizer(exp," +-*/",true);
		while(tokens.hasMoreTokens()){
			String token=tokens.nextToken().trim();
			if(token.equals(""))
				continue;
			else if(token.equals("+")||token.equals("/")||token.equals("*")||token.equals("-")){
				     process(numS,token);
			}

			else{
				numS.push(Double.parseDouble(token));
			}
		}

			return numS.pop();
		}
	public static void process(Stack<Double> num,String ope){
		double num2=num.pop();
		double num1=num.pop();
		if(ope.equals("+")){
			num.push(num1+num2);
		}else if(ope.equals("-")){
			num.push(num1-num2);
		}else if(ope.equals("*")){
			num.push(num1*num2);
		}else{
			num.push(num1/num2);
		}
		
		
	}
	

}
