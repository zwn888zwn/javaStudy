package $5;
//
//2����1������һ������Person����֪ʶ�㣺����Ĵ�����ʹ�ã� 
//1)����һ������sayHello()��������Է������ʺ��hello,my name is XXX��
//2)���������ԣ����֡���ߡ�����
//3)ͨ�����췽�����ֱ���������Ը�ֵ
//��2������һ��Constructor�ࣺ
//1�������������󣬷ֱ���zhangsan��33�꣬1.73��lishi��44��1.74
//2���ֱ���ö����sayHello()������
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