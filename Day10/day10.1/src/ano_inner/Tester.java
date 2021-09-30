package ano_inner;

public class Tester {

	public static void main(String[] args) {
		Printable p=new MyPrintable();//up casting
		p.print("some message");
		//anonymous inner class : using i/f
		//new Printable() => instance of anonymous inner class which implements Printable i/f
		Printable p2=new Printable() { //ano inner class beginning
			@Override
			public void print(String mesg)
			{
				System.out.println("printing from ano inner 1"+mesg);
			}

			@Override
			public double calc(double d1, double d2) {
				// TODO Auto-generated method stub
				return d1*d2;
			}
			
			
		};//ano inner cls over
		p2.print("another mesg!!!!!");
		System.out.println(p2.calc(10, 234));
		

	}

}
