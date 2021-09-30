package strings;

public class Test5 {

	public static void main(String[] args) {
		// create a stringbuilder object inited with some string
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("sb contents " + sb);// hello
		System.out.println("len " + sb.length() + " capa " + sb.capacity());// 5 , 21
		sb.append(12.35);
		System.out.println(sb);// hello12.35
		sb.append(true).append(1234).append(33.44F);
		System.out.println(sb);
		StringBuilder sb1 = sb.replace(0, 5, "HELLO");
		System.out.println(sb);//HELLOtrue,.....
		System.out.println(sb1);//HELLOtrue,.....
		System.out.println(sb == sb1);//true
		System.out.println(sb.equals(sb1));//true
		StringBuilder sb2=new StringBuilder("hello");
		StringBuilder sb3=new StringBuilder("hello");
		System.out.println(sb==sb2);//f 
		System.out.println(sb.equals(sb2));//f : since SB class has not overridden equals method of Object class
		//chks by ref equality
	}

}
