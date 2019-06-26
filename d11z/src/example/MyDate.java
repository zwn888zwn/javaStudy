package example;

public class MyDate {
	private int year,month,day;
	MyDate(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public void setYear(int year){
		this.year=year;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setDay(int day){
		this.day=day;
	}
	public boolean after(MyDate date){
		if(this.year>date.year)
		  if(this.month>date.month)
		    if(this.day>date.day)
			    return true;
			return false;
	}
	public boolean equals(MyDate date){
		return this.year==date.year&&this.month==date.month&&this.day==date.day;
	}

}
class MyTime extends MyDate{
	private int hour,minute,second;
	MyTime(int year,int month,int day,int hour,int minute,int second){
		super(year,month,day);
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	public void setHour(int hour){
		this.hour=hour;
	}
	public void setMinute(int minute){
		this.minute=minute;
	}
	public void setSecond(int second){
		this.second=second;
	}
	public boolean after(MyTime time){
	if(super.equals(time)||super.equals(time))
		if(this.hour>time.hour)
		  if(this.minute>time.minute)
		    if(this.second>time.second)
			    return true;
			return false;
	}
	public boolean equals(MyTime time){
		if(super.equals(time)&&this.hour==this.hour&&this.minute==time.minute&&this.second==time.second)
			return true;
		return false;	
	}

	
	
}
