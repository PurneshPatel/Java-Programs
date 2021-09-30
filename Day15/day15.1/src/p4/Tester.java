package p4;

import static p4.Utils.testCompute;

public class Tester {

	public static void main(String[] args) {
		// perform addition on 2 numbers
		System.out.println(testCompute(10, 20, new Computable() {

			@Override
			public double compute(double a, double b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		}));
		// perform subtraction on 2 numbers
		System.out.println(testCompute(10, 20, new Computable() {

			@Override
			public double compute(double a, double b) {
				// TODO Auto-generated method stub
				return a - b;
			}
		}));
		// FP : declarative style of prog
		// perform mult on 2 nums
		// double compute(double a, double b);
//		System.out.println(testCompute(10, 20, (double a, double b) -> {
//			return a * b;
//		}));
		System.out.println(testCompute(10, 20, (a, b) -> a * b));

	}

}
