package $5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ticket {
	static int num=0;
	
	public synchronized static void sailT(String name){
		if(num<100){
			num++;
			System.out.println(name+":"+num);
		}
	}
	public static void main(String[] args) {
		ExecutorService exc=Executors.newCachedThreadPool();
		exc.execute(new sails("上海"));
		exc.execute(new sails("北京"));
		exc.execute(new sails("广东"));
		exc.shutdown();
	}

}
class sails implements Runnable{

	String sailName;
	public sails(String sailName){
		this.sailName=sailName;
	}
	public void run() {
		for(int i=0;i<100;i++){
			Ticket.sailT(sailName);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
