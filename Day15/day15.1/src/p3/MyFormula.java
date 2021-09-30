package p3;

public class MyFormula implements Formula{

	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method in MyFormula");
		return a*10;
	}
	//can one override inherited static method : NO
//	@Override
	static boolean isEven(int number)
	{
		System.out.println("re declaring static method");
		return number % 2 ==0;
	}
}
