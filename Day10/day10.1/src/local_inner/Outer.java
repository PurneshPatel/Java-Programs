package local_inner;

public class Outer {
//add a method to hold entire class defintion
	void test()
	{
		int data=100;
		System.out.println("in test...");
		class Inner {
			private int i;
			
			public Inner(int i) {
				super();
				this.i = i;
			}

			void display()
			{
				System.out.println("in inner's display"+i);
			}
		}
		//display() : can be only accessed from here
		Inner in=new Inner(11);
		in.display();
		
	}
	void testMe()
	{
//		Inner in=new Inner(11);
//		in.display();
	}
}
