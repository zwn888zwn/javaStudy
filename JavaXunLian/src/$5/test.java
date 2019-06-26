package $5;

import java.util.Vector;

public class test {

	public static void main(String[] args) {
		double p=1.0;
		int k=0;
		while(p>0.5){
			k++;
			p*=(364/365.0)*(364/365.0);
		}
			System.out.println(k);

	}

}
