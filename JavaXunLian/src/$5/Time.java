package $5;

public class Time {
	public static void main(String[] args){
		FullTime f=new FullTime(2002,7,30,22,12,35);
		System.out.println(f.toString());
	}
}
	class MyTime{
		private int hour,minute,second;
		MyTime(){
			
		}
		void getHour(int t){	}			
		void setHour(int t){
			hour=t;
		}
		void getMinute(int t){	}			
		void setMinute(int t){
			minute=t;
		}
		void getSecond(int t){	}			
		void setSecond(int t){
			second=t;
		}
		public String toString(){
			return hour+"ʱ"+minute+"��"+second+"��";
		}			
		}
	class MyDate{
		private int year,month,day;
		MyDate(){
			
		}
		void getYear(int t){	}			
		void setYear(int t){
			year=t;
		}
		void getMonth(int t){	}			
		void setMonth(int t){
			month=t;
		}
		void getDay(int t){};			
		void setDay(int t){
			day=t;
		}
		public String toString(){
			return year+"��"+month+"��"+day+"��";
		}			
		
	}
	class FullTime{
		MyTime T=new MyTime();
		MyDate D=new MyDate();
		String time,date;
		FullTime(int a,int b,int c,int x,int y,int z){
			D.setYear(a);
			D.setMonth(b);
			D.setDay(c);
			T.setHour(x);
			T.setMinute(y);
			T.setSecond(z);
			 time=T.toString();
			 date=D.toString();
		}
		
		public String toString(){
			return date+time;
			
		}	
	
		
	}
	
	


