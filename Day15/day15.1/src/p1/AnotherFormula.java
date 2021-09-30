package p1;

public class AnotherFormula implements Formula{

	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method in AnotherFormula");
		return a/10;
	}

	@Override
	public double sqrt(double a, double b) {
		System.out.println("overridng def method");
		return Math.sqrt(a*b);
	}
	

}
