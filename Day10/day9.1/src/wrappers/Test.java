package wrappers;

public class Test {

	public static void main(String[] args) {
		int data=1234;
		Integer i1=Integer.valueOf(data);//boxing : explicitly done by prog
		int value=i1.intValue();//un boxing : explicitly done by prog
		Integer i2=1235;//auto boxing : implicitly done by javac (int---->Integer : valueOf)
		value=i2;//auto un  boxing : implicitly done by javac (Integer ---> int : intValue)
		String s="hello";
		s+=10;//s = s.concat(10)
		System.out.println(s);
		//s++;
	//	s *= 10;
		i2++;//auto unboxing(Integer-->int) ---inc (int) --->auto boxing
		System.out.println(i2);//1236
		Double d1=1234.56;//auto boxing
		double data2=d1;//auto un boxing
		data2=data;//automatic promotion (widening) : javac (int ---> double)
	//	d1=1234;//int ---> Integer(auto boxing) ----X----> Double
		d1=(double)1234;//double --->Double (auto boxing)
		data2=123.456F;//widening 
	//	d1=12.34F;//float--->Float ----X----> Double
		Number n1=123.456;//double ---> Double (auto boxing) ---> Number (up casting)
		n1=12.34F;
		Object ref="hello";//up casting
		ref=true;//boolean ---> Boolean (auto boxing) ---> Object (up casting)
		ref=100;
		ref=123.456F;
		//Can Object type of the reference directly refer to ANY data type (primitive/ref) in Java ? YES
		

	}

}
