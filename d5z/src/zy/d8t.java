package zy;

public class d8t {
	public static void main(String[] args) {
		int a = 0,sum=0,sum1=0;
		for(int k=1;k<=1000000;k++){
		 a=(int)(Math.random()*2);
		  if(a==1)
			  sum++;
		  if(a==0)
			  sum1++;
		}
		System.out.println("正面次数"+sum+"反面次数"+sum1)  ;

	}

}
