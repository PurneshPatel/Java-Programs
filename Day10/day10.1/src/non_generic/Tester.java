package non_generic;

public class Tester {

	public static void main(String[] args) {
		// create Holder class instance that can hold int data
		Holder h1=new Holder(1234);//int ---> Integer (auto boxing) --> up casting : impl done by javac
		int data=(Integer)h1.getRef();//Object ---X---int , add down casting : prog , auto un boxing : javac
		// create Holder class instance that can hold string 
		Holder h2=new Holder("hello");//string ---> obj (up casting)
		String s=(String)h2.getRef();//obj ---X--->string
		h1=h2;
		data=(Integer)h1.getRef();
		System.out.println(data);
	}

}
