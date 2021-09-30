package p2;

public interface A {
	//public static final
	int DATA = 100;
	default void show()
	{
		System.out.println("1");
	}
}
