package BLUE;

import java.math.BigDecimal;
import java.math.MathContext;

public class huangjin {

	public static void main(String[] args) {
		BigDecimal bd =(huangB(0));
		System.out.println(bd);
		System.out.println(getGoldNumber(100));
	}
	public static  double huang(int i){
		if(i==300){
			return 100;
		}
		else
			return (1/(1+huang(i+1)));
	}	
	public static  BigDecimal huangB(int i){
		if(i==1000){
			return new BigDecimal(5.0);
		}
		else
			return new BigDecimal(1.0).divide(new BigDecimal(1.0).add(huangB(i+1)), 100,BigDecimal.ROUND_HALF_UP);
	}		
    public static String getGoldNumber(int n){
    BigDecimal a = new BigDecimal(0.618);
    BigDecimal b = new BigDecimal("1");

for (int i = 1; i < 100000; i++) {
    a = b.divide(a.add(b), n, BigDecimal.ROUND_HALF_UP);
    }
    return a.toString();
    } 

}
