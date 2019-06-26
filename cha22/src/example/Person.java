package example;

public class Person {
	private String id;
	private String name;
	Person(){}
	Person(String id,String name){
		this.id=id;
		this.name=name;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void display(){
		System.out.println("id: "+id);
		System.out.println("name: "+name);
	}
	public String toString(){
		return id+"-"+name;
	}
	public  boolean equals(Object o){
		if(this==o)
			return true;
		if(o instanceof Student){
		     if(this.getId()==((Student)o).getId()&&this.getName()==((Student)o).getName())
				return true;
		  }
		  else
				return false;
		 return false;
		}

}
