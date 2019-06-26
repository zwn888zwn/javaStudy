package $5;

import java.util.Scanner;

public class jinrongfengbao {
	static double Limit;
	static int count=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int numOfBank=scan.nextInt();
		Limit=scan.nextDouble();
		double[][] balance=new double[numOfBank][2];
		double[][] borrowers=new double[numOfBank][numOfBank];
		for(int i=0;i<borrowers.length;i++){
			balance[i][0]=scan.nextDouble();
			balance[i][1]=scan.nextDouble();
			while(true){
				int id=scan.nextInt();
				if(id==-1){
					break;
				}
				double money=scan.nextDouble();
				borrowers[id][i]=money;//i银行借了ID银行多少钱
			}
		}
		add(balance,borrowers);
		check(balance,borrowers);
	}
	public static void add(double[][] balance,double[][] borrow){//计算总余额
		for(int i=0;i<borrow.length;i++){
			for(int k=0;k<borrow.length;k++){
				balance[i][0]+=borrow[k][i];
			}
		}	
	}
	public static void sub(double[][] balance,double[][] borrow,int id){//减去破产银行
		for(int i=0;i<borrow.length;i++){
			if(balance[i][0]>0){
				balance[i][0]-=borrow[id][i];
				}
		}	
	}
	public static void check(double[][] balance,double[][] borrowers){//检查是否破产
		for(int i=0;i<balance.length;i++){
			if((!(balance[i][0]==0))&&balance[i][0]<Limit){
				balance[i][0]=0;
				System.out.println("bank "+i+" is unsafe");
				sub(balance,borrowers,i);
				check(balance,borrowers);
				return;
			}
		
		}	
	}
/*	
    5 201
	25 2 1 100.5 4 320.5 -1
	125 2 2 40 3 85 -1
	175 2 0 125 3 75 -1
	75 1 0 125 -1
	181 1 2 125 -1                */
	//测试数据

}
