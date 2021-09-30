package p2;

public class C implements A,B{
	//In case of duplicate default methds :
	//javac FORCES to overide the def method impl. (o.w gives javac err)

	@Override
	public void show() {
		System.out.println("overriding dup def method");
		//how to refer to inherited func ? i/f Name.super.methodName
		A.super.show();
		B.super.show();
		System.out.println(A.DATA);
		System.out.println(B.DATA);
		
	}
	
}
