package customer;

public enum CustomerCategory {
	SILVER, GOLD, DIAMOND, PLATINIUM;
	@Override
	public String toString()
	{
		return name().toUpperCase();
	}
}
