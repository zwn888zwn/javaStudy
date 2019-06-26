package $5;
//
//2．（1）定义一个人类Person：（知识点：对象的创建和使用） 
//1)定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
//2)有三个属性：名字、身高、体重
//3)通过构造方法，分别给三个属性赋值
//（2）定义一个Constructor类：
//1）创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
//2）分别调用对象的sayHello()方法。
//


class Person{
	String name;
	double high;
	double weight;
	Person(String name,double high,double weight){
		this.name=name;
		this.high=high;
		this.weight=weight;
	}
	void sayHello(){
		System.out.println("hello,my name is "+this.name);
	}
}
class PersonCreate{
	public static void main(String[] args) {
		Person p=new Person("zhangsan",33,1.73);
		Person q=new Person("lish",44,1.74);
		p.sayHello();
		q.sayHello();
	}
}