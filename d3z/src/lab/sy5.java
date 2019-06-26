package lab;

import java.util.*;

public class sy5 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("输入一个4位数");
	int[] zu=new int[4];
	for (int i = 0; i < 4;) {
		int a;
		boolean t=true;
		a = (int) (Math.random() * 10);
		for (int k = 0; k < i; k++) {
			if (a == zu[k]) {
				t=false;
				break;
			}
		}
		if(t){
			zu[i] = a;
			i++;
		}
	}
	//System.out.println(Arrays.toString(zu));
    int n=1;
	for(int i=1;i<=7;i++){
	    n++;
		String shuzi=scan.next();
		int[] zu1=new int[4];
		for(int k=0;k<4;k++){
			String shu=shuzi.substring(k,k+1);
			zu1[k]=Integer.parseInt(shu);
		}
		int a=0,b=0;
		for(int k=0;k<4;k++){
			if(zu[k]==zu1[k])
				a++;
		}
		for(int k=0;k<4;k++){
			for(int j=0;j<4;j++){
				if(zu[k]==zu1[j])
					b++;
			}
		}
		if(a!=4)
		   System.out.println("提示"+a+"A"+(b-a)+"B");
		else{
			System.out.println("答对了");
			break;
		}
	}
	if(n==8)
		System.out.println("失败");
	}

}
