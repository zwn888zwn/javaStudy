package example;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Student  {
	private String name;
	private String sex;
    private Date date;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Student(String name,String sex,String date) throws ParseException{
    	this.name=name;
    	this.sex=sex;
    	this.date=sdf.parse(date);
    }
    public int getAge(){
    	Date dd=new Date();
    	long year=(dd.getTime()-date.getTime())/(365l*24*60*60*1000);
    	return (int)(Math.floor(year)-1);
    }
    public String toString(){
    	return "姓名"+name+"，性别"+sex+",年龄"+getAge()+",出生日期"+sdf.format(date);
    }
}
