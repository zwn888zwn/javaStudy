package example;

import java.util.ArrayList;
import java.util.Collections;

public class TestColumn {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Column(1,2));
		al.add(new Column(2,1));
		al.add(new Column(3,4));
		Collections.sort(al);
		System.out.println(al);

	}

}
