package strings;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		String s = "hi there user !!!!!, welcome user";
		System.out.println("char at 3rd index " + s.charAt(3));
		// System.out.println(s.charAt(s.length())); : run time err
		System.out.println(s.charAt(0) + " " + s.charAt(s.length() - 1));
		// chk if a string is containing "user"
		System.out.println(s.contains("USER"));
		System.out.println(
				"index of 1st occurrence of \"user\" " + s.indexOf("user") + " last index " + s.lastIndexOf("user"));
		//comparison : compareTo
		String s1="anish";
		String s2="Anushka";
		String s3="Priya";
		String s4="Amit";
		System.out.println(s1.compareTo(s4));
		//String class API : public String[] split​(String regex)
		String s5="one,two,three,four,five";
		//display these CSVs.
		String[] tokens=s5.split(",");
		System.out.println(Arrays.toString(tokens));
	}

}
