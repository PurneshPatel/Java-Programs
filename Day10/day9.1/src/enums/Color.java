package enums;

public enum Color //extends java.lang.Enum
{
	RED, GREEN, BLUE, YELLOW, PINK;
	//Can you override toString/equals/compareTo : toString
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
	
}
