package lab;

public class sy2_4 {
	public static void main(String[] args) {
	  //重载数组 返回数组的平均数
      int[] zu={1,2,3,4,5};
        double[] zu1={1.1,2.2,3.3,4.4};
        System.out.println(getAverage(zu));
        System.out.println(getAverage(zu1));
	}
	public static double getAverage(int[] array){
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		return (double)sum/array.length;
	}
	public static double getAverage(double[] array){
		double sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		return sum/array.length;
	}

}
