package homework;

public class MyDate implements Comparable {
	private int year;

	private int month;

	private int day;
	public int compareTo(Object o){
		/*if(this.getYear()>((MyDate)o).getYear())
			return 1;
		else if(this.getYear()==((MyDate)o).getYear())
			  if(this.getMonth()>((MyDate)o).getMonth())
				  return 1;
		else if(this.getMonth()==((MyDate)o).getMonth())
				  if(this.getDay()>((MyDate)o).getDay())
				    return 1;
		else if (this.getDay()==((MyDate)o).getDay())
				    return 0;
		return -1;		*/
	}

	public MyDate(int year, int month, int day) {

		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}	
	public String toString(){
		return this.getYear()+"Äê"+this.getMonth()+"ÔÂ"+this.getDay()+"ÈÕ";
	}
}
