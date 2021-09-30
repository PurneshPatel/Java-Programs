package tester;

public class TestInhertance1 {

	public static void main(String[] args) {
		C c1=new C();
	}

}
class A //extends Object
{
	A()
	{
		super();
		System.out.println("1");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("2");
	}
}
class C extends B
{
	C()
	{
	    super();//javac implicitly adds invocation of the immediate super cls constr
		System.out.println("3");
	}
}
