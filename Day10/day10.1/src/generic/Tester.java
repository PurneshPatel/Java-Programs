package generic;

public class Tester {

	public static void main(String[] args) {
		// create generic Holder class instance that can hold int data
		//diamond operator (added JDK 1.7) => type of RHS is inferred from type of LHS
		Holder<Integer> h1=new Holder<>(1234);//int --> Integer (auto boxing)
		int data=h1.getRef();//Integer --> int (auto un boxing) : impl done by javac
		// create generic  Holder class instance that can hold String
		Holder<String> h2=new Holder<>("acbhfshf");//NO impl conversion
		String s=h2.getRef();//no down casting required 
	//	h1=h2;//type mismatch error caught @ compile time
		
	}

}
