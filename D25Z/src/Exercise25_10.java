import java.util.Stack;
import java.util.StringTokenizer;


public class Exercise25_10 {

	public static void main(String[] args) {
		System.out.println(evlauateExpression("(9+((3-1)*3))+(10/2)"));

	}
	public static String evlauateExpression(String exp){
		Stack numS=new Stack();
		Stack opeS=new Stack();
		StringTokenizer tokens=new StringTokenizer(exp,"()+-*/",true);
		while(tokens.hasMoreTokens()){
			String token=tokens.nextToken().trim();
			if(token.length()==0)
				continue;
			else if(token.charAt(0)=='+'||token.charAt(0)=='-'){
				while(!opeS.isEmpty()&&(opeS.peek().equals("+")||opeS.peek().equals("-")||opeS.peek().equals("*")||
						opeS.peek().equals("/"))){
				     process(numS,opeS);
				}
				opeS.push(token);
			}
			else if(token.charAt(0)=='*'||token.charAt(0)=='/'){
				while(!opeS.isEmpty()&&(opeS.peek().equals("*")||
						opeS.peek().equals("/"))){
					process(numS,opeS);
				}
				opeS.push(token);
			}
			else if(token.charAt(0)=='('){
				opeS.push(token);
			}
			else if(token.charAt(0)==')'){
				while(!opeS.peek().equals("(")){
					process(numS,opeS);
				}
				opeS.pop();
			}
			else{
				numS.push(token);
			}
		}
		while(!opeS.isEmpty()){
			process(numS,opeS);
		}
			return numS.pop().toString();
		}
	public static void process(Stack num,Stack ope){
		String op=(String)ope.pop();
		String num2=(String)num.pop();
		String num1=(String)num.pop();
		String result=num1+" "+num2+" "+op+" ";
		num.push(result);
	}
	

}
