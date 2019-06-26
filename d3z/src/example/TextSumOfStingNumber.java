package example;

public class TextSumOfStingNumber {
	public static void main(String[] args) {
		String numbs="12,14,55,67,5.5";
		String[] arr=numbs.split(",");
		double sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=Double.parseDouble(arr[i]);
		}
		System.out.println("ºÍÎª"+sum);
          String ss=Double.toHexString(1.5);
          System.out.println(ss);
	}
	

}
