package BLUE;

public class shijimodexingqi {

	public static void main(String[] args) {
		int day=0;
		for(int year=1999;;year++){
			 day+=getDayOfYear(year);
			if(year%100==99&&day%7==2){
				System.out.println(year);
				break;
			}
		}

	}
	public static int getDayOfYear(int year){
		if(year%4==0&&year%100!=0||year%400==0)
			return 366;
		return 365;
	}

}
