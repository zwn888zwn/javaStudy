package example;

public class Teacher extends Person {
	private String title;
	public Teacher(String title,String id,String name){
		super(id,name);
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void display(){
		super.display();
		System.out.println("职称"+title);
	}
	public void teach(){
		System.out.println("老师要教书!");
	}
	public String toString(){
		return this.getId()+"-"+this.getName()+"-"+title;
	}
	public  boolean equals(Object o){
		if(this==o)
			return true;
		if(o instanceof Teacher){
		     if(this.getId()==((Teacher)o).getId()&&this.getName()==((Teacher)o).getName()&&this.title==((Teacher)o).title)
				return true;
		  }
		  else
				return false;
		 return false;
		}

}
