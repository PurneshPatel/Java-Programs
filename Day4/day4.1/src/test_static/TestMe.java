package test_static;

public class TestMe {
	public static int counter;

	public static void main(String[] args) {
		System.out.println("counter="+counter);
		add(2, 3);

	}
	private static double add(double d1,double d2)
	{
		TestMe ref=new TestMe();
		ref.multiply(12,34);//static method CAN'T directly access non static members
		System.out.println(counter);//static method CAN directly access static members
		return d1+d2;
	}
	private double multiply(double d1,double d2)
	{
	//	add(12, 20);
		return d1*d2;
	}

}
