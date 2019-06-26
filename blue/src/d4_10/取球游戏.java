package d4_10;

public class È¡ÇòÓÎÏ· {
	static int[] zu=new int[10001];
	static int[] qiu=new int[4];
	public static void main(String[] args) {
		qiu[0]=1;
		qiu[1]=3;
		qiu[2]=7;
		qiu[3]=8;
		if(quqiu(3,true))
		System.out.println(1);
		else
		System.out.println(0);

	}
	public static boolean quqiu(int left,boolean winA){
		if(zu[left]!=0){
			if(zu[left]==1){
				return false;
			}
			else
				return true;
			
		}
		else{
			
				
			if(left==0&&winA){
				return true;
			}
			
			for(int i=3;i>=0;i--){
				
				if(left-qiu[i]>=0&&quqiu(left-qiu[i],!winA)){
					return true;
				}
				
			}
			return false;
			
			
			
		}
		
		
	}

}
