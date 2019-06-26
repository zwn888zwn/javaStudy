package BLUE;

import java.util.Vector;

public class Question12 {
	public static void main(String[] args) {
		Vector num= new Vector();
		Vector num1= new Vector();
		for(int i=1;i<=9;i++){
			num.add(new Integer(i));
		}
		allSort(num,num1);
		

	}
	public static void allSort(Vector vec,Vector result){

		if(vec.size()==0){
			if(Integer.parseInt(result.elementAt(0).toString())*100+Integer.parseInt(result.elementAt(1).toString())*10+Integer.parseInt(result.elementAt(2).toString())+Integer.parseInt(result.elementAt(3).toString())*100+Integer.parseInt(result.elementAt(4).toString())*10+Integer.parseInt(result.elementAt(5).toString())==Integer.parseInt(result.elementAt(6).toString())*100+Integer.parseInt(result.elementAt(7).toString())*10+Integer.parseInt(result.elementAt(8).toString())){
						System.out.println(result.elementAt(0).toString()+result.elementAt(1).toString()+result.elementAt(2).toString()+"+"+result.elementAt(3).toString()+result.elementAt(4).toString()+result.elementAt(5).toString()+"="+result.elementAt(6).toString()+result.elementAt(7).toString()+result.elementAt(8).toString());
					}
			
		}
		for(int i=0;i<vec.size();i++){
			Vector num= new Vector(vec);
			Vector result1= new Vector(result);
			result1.add(num.remove(i));
			allSort(num,result1);
		}
		
	}

}
