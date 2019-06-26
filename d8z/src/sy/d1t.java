package sy;

import java.util.Arrays;
//生成0-9之间的100个随机数，并且显示每一个数出现的次数
public class d1t {
	public static void main(String[] args) {
		int[] a = new int[10];
		int count;
		for (int i = 0; i <= 100; i++) {
			count = (int) (Math.random() * 10);
			a[count]++;
		}
		System.out.println("各数的出现次数");
		for (int k = 0; k <10; k++)
			System.out.println("  " + k+"出现了 "+a[k]+"次");
		//System.out.println();
		//System.out.println(Arrays.toString(a));
	}

}
