package p1;

public interface Formula {
	double calculate(double a);// public n abstract : added implicitly by javac
	// public n concrete

	default double sqrt(double a, double b) {
		System.out.println("in i/f 's default method");
		return Math.sqrt(a + b);
	}
}
