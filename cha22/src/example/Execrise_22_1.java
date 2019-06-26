package example;
import java.util.*;
public class Execrise_22_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List s1_1= Arrays.asList("George","Jim","John","Blake","Kevin","Mechael");
		List s2_2=Arrays.asList("George","Katie","Kevin","Michelle","Ryan");
		ArrayList s1=new ArrayList(s1_1);
		ArrayList s2=new ArrayList(s2_2);
		//s1.addAll(s2);  ²¢
		adds(s1,s2);
		//s1.removeAll(s2); ²î
		//s1.retainAll(s2);// ½»
		System.out.println(s1);
		

	}
	public static void adds(List<String> l1,List<String> l2){
		for(String l:l2){
			if(l1.contains(l)){
				continue;
			}
			l1.add(l);
		}
	}

}
