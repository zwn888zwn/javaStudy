package example;

public class serch {
	public static void main(String[] args) {
		String s="welcome to jaaa jaaa java";
		int k=0;
		for(int i=0;i<s.length()-1;){
			  if((s.indexOf("a",i))>0)
				  k++;
			  i=s.indexOf("a",i+1);
			  if(i<0)
				  break;
		}
        System.out.println(k);
	}

}
