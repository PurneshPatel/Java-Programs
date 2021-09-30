package p4;

public class Utils {
//add a static method to perform ANY op : higher order function(method)
	public static double testCompute(double n1,double n2,Computable ref)
	{
		return ref.compute(n1, n2);
	}
}
