package example;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle c=new Circle(5);
		Rectangle r=new Rectangle(2,3);
		boolean yes=isEqualsArea(c,r);
		System.out.printf("面积相等吗？%b\n", yes);
	}
	public static boolean isEqualsArea(Figure f1,Figure f2){
		return f1.getArea()==f2.getArea()?true:false;
	}

}

