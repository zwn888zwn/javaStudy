package $5;

import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent; 
import java.awt.event.MouseEvent;
public class RobotExp {
	static int count=0;
	public static void main(String[] args) { 
	
	try { 
	 Robot robot = new Robot(); //定义5秒的延迟以便你打开notepad // Robot 开始写
	robot.keyPress(KeyEvent.VK_X);
	robot.delay(2000);
	//new Thread(new buff1()).start();
    while(true){
    	if(count==10){
    		count=0;
    		 robot.keyPress(KeyEvent.VK_7);
    		 robot.delay(2000); 		
    	}
    	robot.mouseMove(455, 765);
    	robot.mousePress(InputEvent.BUTTON1_MASK);
    	robot.mouseRelease(InputEvent.BUTTON1_MASK);
		robot.delay(6500); 		
		robot.keyPress(KeyEvent.VK_RIGHT);	
		robot.delay(1000); 	
		robot.keyRelease(KeyEvent.VK_RIGHT);
		robot.keyPress(KeyEvent.VK_X);	
		robot.delay(6500); 		
		robot.keyPress(KeyEvent.VK_LEFT);	
		robot.delay(1000); 	
		robot.keyRelease(KeyEvent.VK_LEFT);
		robot.keyPress(KeyEvent.VK_X);
		count++;
	}

	} catch (AWTException e) { 
		e.printStackTrace(); 
	} 
	}
}
class buff1 implements Runnable {
	
	@Override
	public void run() {
		try{
			 Robot robot = new Robot();
			 for(int i=0;i<5;i++){
				 robot.delay(3000);
			 robot.keyPress(KeyEvent.VK_1);
			
			 }
		}catch (AWTException e) { 
			e.printStackTrace(); 
		} 
		
	}
	
}