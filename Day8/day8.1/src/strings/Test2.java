package strings;
/*
 * == vs equals vs equalsIgnoreCase
 */
public class Test2 {

	public static void main(String[] args) {
		String s1=new String("hello");//RHS : non literal
		String s2=new String("Hello");
		String s3=new String("hello");
		System.out.println(s1==s2);//false : ref eq
		System.out.println(s1.equals(s2));//false : case sensitive content eq
		System.out.println(s1.equalsIgnoreCase(s2));//true : case insensitive content eq
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
				
				

	}

}
