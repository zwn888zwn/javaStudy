package $5;

import java.util.*;
import java.awt.event.*;

public class StudentWithActionEvent  {
  private ArrayList<String> students = new ArrayList<String>();

  private ArrayList<ActionListener> actionListenerList;

  public void addStudent(String name,String nation) {
    

    if (!nation.equals("CHINA") ) {
      // Fire ActionEvent
      processEvent(new ActionEvent(this,
        ActionEvent.ACTION_PERFORMED, null));
      return;
    }
    students.add(name+","+nation);
  }


  public ArrayList getArr(){
	  return (ArrayList) students.clone();
  }

  public int getNumberOfStudents() {
    return students.size();
  }



  /** Register an action event listener */
  public synchronized void addActionListener
      (ActionListener listener) {
    if (actionListenerList == null) {
      actionListenerList = new ArrayList<ActionListener>(2);
    }

    if (!actionListenerList.contains(listener)) {
      actionListenerList.add(listener);
    }
  }

  /** Remove an action event listener */
  public synchronized void removeActionListener
      (ActionListener listener) {
    if (actionListenerList !=
        null && actionListenerList.contains(listener)) {
      actionListenerList.remove(listener);
    }
  }

  /** Fire ActionEvent */
  private void processEvent(ActionEvent e) {
    ArrayList list;

    synchronized (this) {
      if (actionListenerList == null) return;
      list = (ArrayList)actionListenerList.clone();
    }

    for (int i = 0; i < list.size(); i++) {
      ActionListener listener = (ActionListener)list.get(i);
      listener.actionPerformed(e);
    }
  }
  public static void main(String[] arg){
	  StudentWithActionEvent stu=new StudentWithActionEvent();
	  stu.addActionListener(new Listener());
	  stu.addStudent("aaa", "CHINA");
	  stu.addStudent("wang", "US");
	  stu.addStudent("bb", "UK");
	  System.out.println(stu.getArr());

  }


}
 class Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("只允许中国人注册");
		
	}
	  
  }