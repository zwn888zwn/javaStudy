package day1;

import java.util.Scanner;

public class t15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double d1,c,d2,p;
		int n;
		d1=scan.nextDouble();
		c=scan.nextDouble();
		d2=scan.nextDouble();
		p=scan.nextDouble();
		n=scan.nextInt();
		double[][] zu=new double[2][n+2];
		zu[0][0]=0;
		zu[1][0]=p;
		int i;
		for(i=1;i<=n;i++){
			zu[0][i]=scan.nextDouble();
			zu[1][i]=scan.nextDouble();
		}
		zu[0][i]=d1;
		zu[1][i]=Double.MAX_VALUE;
		double[][] price=new double[n+2][n+2];
		for(int j=0;j<price.length;j++){
			for(int k=0;k<price.length;k++){
				price[j][k]=Double.MAX_VALUE;
			}
		}
		for(int j=0;j<price.length;j++){
			for(int k=j+1;k<price.length;k++){
				if((zu[0][k]-zu[0][j])/d2<=c)
				price[j][k]=(zu[0][k]-zu[0][j])/d2*zu[1][j];
			}
		}
		double[] minP=new double[price.length];
		for(int j=0;j<minP.length;j++)
			minP[j]=Double.MAX_VALUE;
		for(int j=0;j<price.length;j++){
			for(int k=j+1;k<price.length;k++){
				if(price[j][k]==Double.MAX_VALUE)
					continue;
				else if(price[j][k-1]==Double.MAX_VALUE)
					 minP[k]=Math.min(minP[k], price[j][k]);
				else
					minP[k]=Math.min(minP[k], price[j][k]-price[j][k-1]);												
			}
		}
		double sum=0;
		boolean sol=false;
		for(int j=1;j<minP.length;j++){
			if(minP[j]==Double.MAX_VALUE){
				sol=true;
				break;
			}
			else
				sum+=minP[j];
		}
		if(sol)	
			System.out.println("No Solution");
		else
			System.out.printf("%.2f", sum);


	}

}
