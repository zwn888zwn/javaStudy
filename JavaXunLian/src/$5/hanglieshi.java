package $5;

import java.util.Scanner;

public class hanglieshi {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("输入阶数");
		int j=s.nextInt();
		double[][] jz=new double[j][j];
		for(int i=0;i<j;i++){
			for(int k=0;k<j;k++){
				jz[i][k]=s.nextDouble();
			}
			System.out.println("已输入"+(i+1)+"行");
		}
		System.out.println("sum="+jisuan(jz));

	}
	public static double jisuan(double[][] jz){
		 double sum=0;
		if(jz.length==2){
			return jz[0][0]*jz[1][1]-jz[0][1]*jz[1][0];
			
		}
		for(int i=0;i<jz.length;i++){
			double[][] jzs=getSub(jz,i,0);
			sum+=(Math.pow(-1.0, i)*jisuan(jzs)*jz[0][i]);
		}

		return sum;

	}
	public static double[][] getSub(double[][] d,int x,int y){
		double[][] jzs=new double[d.length-1][d.length-1];
		int a = 0,b=0;
		for(int i=0;i<d.length;i++){
			a=0;
			if(i==y){
				continue;
			}
			for(int k=0;k<d.length;k++){
				if(k==x){
					continue;
				}
				jzs[a][b]=d[i][k];
			
				a++;
			}

			b++;
		
		}
	return jzs;
	}

}

