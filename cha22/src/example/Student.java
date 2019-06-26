package example;

public class Student extends Person {
	private String major;
	Student(String id,String name,String major){
		super(id,name);
		this.major=major;
	}
	Student(){}
	public String getMajor(){
		return major;
	}
	public void setMajor(String major){
		this.major=major;
	}
	
	public void display(){
		super.display();
		System.out.printf("major: %s",major);
	}
	public String toString(){
		return this.getId()+"-"+this.getName()+"-"+major;
	}
	public  boolean equals(Object o){
		if(this==o)
			return true;
		if(o instanceof Student){
		     if(this.getId()==((Student)o).getId()&&this.getName()==((Student)o).getName()&&this.major==((Student)o).major)
				return true;
		  }
		  else
				return false;
		 return false;
		}
	public int hashCode(){
		return (this.getId()+this.getName()).hashCode();
	}
      
}

      
    	  
      
