package zy;

public class d6t {
	public static void main(String[] args) {
		
		int k=2, t=1,sum=0;
		
		while(k<10000){
			sum=0;
			String s="";
		 for(t=1;t<k;t++){
			if(k%t==0){
			s=s+t+"+";
			sum+=t;			
		    }
	     }
		 if(sum==k){
			  s = s.substring(0,s.length()-1);
	    	   System.out.println(k+"="+s);
		 }
		 k++;
		}
		
	}
}

