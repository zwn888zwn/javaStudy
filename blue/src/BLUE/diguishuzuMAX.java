package BLUE;

public class diguishuzuMAX {

	public static void main(String[] args) {
		int[] zu={4,3,2,8,0,-1,9,5,3,-7};
		System.out.println(max(zu,0));
	}
	public static int max(int[] zu,int i){
		if(i==zu.length)
			return zu[i-1];
		return zu[i]>=max(zu,i+1)?zu[i]:max(zu,i+1);
	}

}
