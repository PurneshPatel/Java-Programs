package strings;
/*
 * Immutability of strings
 */
public class Test1 {

	public static void main(String[] args) {
		 String s="hello";
		s.concat("hi");
		System.out.println(s);//hello
		s += "12345";//s = s+"12345"
		System.out.println(s);//hello12345
		String s1=s.toUpperCase();
		System.out.println(s);//orig 
		System.out.println(s1);// uppercased
		String s2=s.replace('l', 'p');
		System.out.println(s);
		System.out.println(s2);

	}

}
