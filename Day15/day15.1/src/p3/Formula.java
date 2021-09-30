package p3;

public interface Formula {
	double calculate(double a);// public n abstract : added implicitly by javac
	// public n concrete

	default double sqrt(double a, double b) {
		System.out.println("in i/f 's default method");
		return Math.sqrt(a + b);
	}
	//can add static method/s
	//keywords added by javac : public 
	static boolean isEven(int number)
	{
		System.out.println("in i/f static method");
		return number % 2 ==0;
	}
}
