package BLUE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 水龙头打水 {
	static int sec=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int[] shui=new int[m];
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0;i<n;i++){
			queue.offer(scan.nextInt());
		}
		boolean hasNext=true;;
		while(hasNext){
			hasNext=false;
			for(int i=0;i<m;i++){
				if(shui[i]==0){
					if(!queue.isEmpty()){
					shui[i]=queue.poll();
					shui[i]--;
					hasNext=true;
					}
				}
				else{
					shui[i]--;
					hasNext=true;
				}
			}
			sec++;
		}
		System.out.println(sec-1);
	}

}
