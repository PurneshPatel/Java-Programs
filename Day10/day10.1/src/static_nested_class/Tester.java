package static_nested_class;

public class Tester {
	public static void main(String[] args) {
         //how to access non static method of the static nested class ?
		Outer.NestedClass nested=new Outer.NestedClass(1234);
		nested.testMe();
	}
}
