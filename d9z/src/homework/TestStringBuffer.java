package homework;

public class TestStringBuffer {
	public static void main(String[] args) {
		String s="this is a aaa";
		System.out.println(delete(s,"is"));
		
	

	}
	public static String delete(String s,String del){
		StringBuffer sb=new StringBuffer(s);
		int pos=sb.indexOf(del);
		while(pos!=-1){
			sb.delete(pos,pos+del.length());
			 pos=sb.indexOf(del);
		}
		return sb.toString();
		
	}

}
