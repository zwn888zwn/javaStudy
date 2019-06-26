package example;

public class TestPerson {
	public static void main(String[] args) {
//        show(new Person("44","ddd"));
//        System.out.println("-------------------------");
//        show(new Teacher("fujs","5555","eeee"));
//        System.out.println("-------------------------");
//        show(new Student("6666666","fff","jisuanji"));
		Student stu1=new Student("33","ccc","com");
		Student stu2=new Student("33","ccc","com");
		System.out.println(stu1.equals(stu2));
	}
	public static void show(Person o){
		o.display();
	}
	

}
