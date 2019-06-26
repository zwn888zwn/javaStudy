package BLUE;

import java.util.Scanner;

public class ZOJ1213 {
	static int[] fix;
	static int ans=13;
	static int[] need;
	static int bLength;
	static int sWidth;
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		bLength=scan.nextInt(); // 1000 100 5 250 250 500 650 1000
		 sWidth=scan.nextInt(); //1000 50 6 200 250 250 500 650 970
		int n=scan.nextInt();
		need=new int[n];
		for(int i=0;i<n;i++){
			need[i]=scan.nextInt();
		}
		fix=new int[n];
		backTrack(bLength,1);
		System.out.println(ans);
	}
	public static void backTrack(int residue,int use){
		//if(true){ //use<=fix.length
		if(hasFixed()){
			ans=Math.min(use, ans);
			return;
		}
		boolean couldFix=false;
		for(int i=0;i<need.length;i++){
			if(fix[i]==0){
				if(residue>=need[i]){
					couldFix=true;
					residue-=need[i];
					fix[i]=1;
					backTrack(residue-sWidth,use);
					residue+=need[i];
					fix[i]=0;
				}
			}
		}
		if(!hasFixed()&&!couldFix){//
			backTrack(bLength,use+1);
		}
	//	}
		
	}
	public static boolean hasFixed(){
		for(int i=0;i<fix.length;i++){
			if(fix[i]==0)
				return false;
		}
		return true;
	}

}
