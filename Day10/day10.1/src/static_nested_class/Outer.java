package static_nested_class;

public class Outer {
	private int i;
	private static int j;
	public Outer(int i) {
		super();
		this.i = i;
	}
	void show()
	{
		NestedClass c=new NestedClass(123);
		System.out.println(i+" "+j+" "+c.k+" "+NestedClass.l);
	}
	static void display()
	{
		Outer o=new Outer(11);
		NestedClass c=new NestedClass(123);
		System.out.println(o.i+" "+j+" "+c.k+" "+NestedClass.l);
	}
	//static nested class
	static class NestedClass
	{
		private int k;
		private static int l;
		public NestedClass(int k) {
			super();
			this.k = k;
		}
		static {
			l=12345;
		}
		void testMe()
		{
			System.out.println("can access "+j+" "+k+" "+l);
		}
		static void testMeAgain()
		{
			System.out.println("can access "+j+" "+l);
		}
		
	}
	

}
