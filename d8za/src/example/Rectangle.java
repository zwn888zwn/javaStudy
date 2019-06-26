package example;

public class Rectangle {
	int height,width;
	Point origin;
	Rectangle(){}
	Rectangle(int height,int width,Point p){
		this.height=height;
		this.width=width;
		origin=p;
	}
	void move(int x1,int y1){
//		origin.x=x1;
//		origin.y=y1;
		Point p=new Point(x1,y1);
		origin=p;
	}
	int getArea(){
		return height*width;
	}

}
