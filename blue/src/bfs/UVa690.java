package bfs;

public class UVa690 {
	static int[] clock={0,1,2,3,0,0,4};
	static int[][] run=new int[5][300];
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			cal(i,0,0);
		}
		int num=0;
		for(;run[4][num]!=10;num++){
			
		}
		System.out.println(num+2);

	}
	public static void cal(int id,int now,int time){
		if(now==clock.length){
			return;
		}
		
		if(run[clock[now]][time]==0){
			run[clock[now]][time]=id+1;
			cal(id,++now,++time);
		}
		else{
			cal(id,now,++time);
		}
			
	}

}
