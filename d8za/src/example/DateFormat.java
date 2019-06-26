package example;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateFormat {
	Date date1=new Date();
	java.text.SimpleDateFormat sim=new java.text.SimpleDateFormat("YYYY-MM-DD");
	String bir ="1996-04-05";
	Date date=null;
	try{
		Date b=sim.parse(bir);
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	System.out.println(b.toString);

}

