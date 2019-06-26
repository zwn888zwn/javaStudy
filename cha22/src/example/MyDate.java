package example;

	public class MyDate implements Comparable{
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


