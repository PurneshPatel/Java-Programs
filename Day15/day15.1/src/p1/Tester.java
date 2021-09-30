package p1;

public class Tester {

	public static void main(String[] args) {
		Formula f1=new MyFormula();//up casting (i/f ref can directly refer to imple class instance)
		System.out.println(f1.calculate(100));
		System.out.println(f1.sqrt(12, 13));
		System.out.println("--------------------------------------");
		f1=new AnotherFormula();
		System.out.println(f1.calculate(100));
		System.out.println(f1.sqrt(12, 13));

	}

}
