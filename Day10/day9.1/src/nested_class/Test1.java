package nested_class;

public class Test1 {

	public static void main(String[] args) {
		
		// Inner in=new Inner(10);
		Outer outer = new Outer(10);// outer cls ref---> outer cls instance
		Outer.Inner inner = outer.new Inner(11);// inner cls ref---> inner cls instance enclosed
		//within the outer class instance
		//invoking outer's non static method
		outer.display();
		//static method
		Outer.show();
		// how to invoke non static method of the inner class ?
		inner.innerShow();
												
	}

}
