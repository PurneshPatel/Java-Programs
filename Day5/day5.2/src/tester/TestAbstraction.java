package tester;

import shapes.BoundedShape;
import shapes.Circle;
import shapes.Rectangle;

public class TestAbstraction {

	public static void main(String[] args) {
		BoundedShape[] shapes= {new Rectangle(20, 40, 12, 15),new Circle(30, 10, 15.5)};
		for(BoundedShape s : shapes)
		{
			System.out.println(s);
			System.out.println("Area "+s.area());
		}

	}

}
