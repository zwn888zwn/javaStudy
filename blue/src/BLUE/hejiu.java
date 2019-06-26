package BLUE;

public class hejiu {
	static int[] zu=new int[4];
	public static void main(String[] args) {
		pailie(zu,0);

	}
	public static void pailie(int []zu,int ci){
		if(ci==4){
		if(1.0/zu[0]+1.0/zu[1]+1.0/zu[2]+1.0/zu[3]==1&&zu[0]>zu[1]&&zu[1]>zu[2]&&zu[2]>zu[3]){
			System.out.println(zu[0]+" "+zu[1]+" "+zu[2]+" "+zu[3]);
		}
		return;
		}
			
		for(int i=20;i>0;i--){
			zu[ci]=i;
			pailie(zu,ci+1);
		}
	}

}
