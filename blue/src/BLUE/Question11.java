package BLUE;

import java.util.Arrays;

public class Question11 {
	public static void main(String[] args) {
		final int YEAR=2012;
		final int MONTH=3;
		final int DAY=12;
		int year=2012;
		String month="06";//{"01","02","03","04","05","06","07","08","09","10","11","12"};
		String[] day={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20",
						"21","22","23","24","25","26","27","28","29","30","31"};
		while(year>=1950){
			
				for(int k=0;k<31;k++){
					String s=""+year+month+day[k];
					int shuzi=Integer.parseInt(s);
					if(shuzi%YEAR==0&&shuzi%MONTH==0&&shuzi%DAY==0){
						System.out.println(s);
					}
				
			}
			year--;
		}
		

	}

}
