package var_args;

public class Test {

	public static void main(String... args) {
		testVarArgs();
		testVarArgs(new String[] {"aa","bb","cc"});
		testVarArgs("one","two","three","four");

	}
	private static void testVarArgs(String... strings)
	{
		System.out.println("Strings : ");
		for(String s : strings)
			System.out.print(s+" ");
		System.out.println();
	}

}
