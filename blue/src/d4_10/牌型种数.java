package d4_10;



public class ÅÆĞÍÖÖÊı {
	public static void main(String[] args) {
		
		System.out.println(mopai(1,0));
	}
	public static int mopai(int index,int all){
		if(all>13)
			return 0;
		if(index>13){
			if(all==13){
				return 1;
			}
			return 0;
		}
		int r=0;
		for(int i=0;i<=4;i++){
			r+=mopai(index+1,all+i);
		}
		return r;
	}

}
