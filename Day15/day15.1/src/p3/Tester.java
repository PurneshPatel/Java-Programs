package p3;

public class Tester {

	public static void main(String[] args) {
		Formula f1=new MyFormula();
		//how to invoke i/f 's static method ?
		Formula.isEven(123);
		//how to invoke class's static method ?
		MyFormula.isEven(123);
	}

}
