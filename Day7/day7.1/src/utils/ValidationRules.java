package utils;

import custom_exception.SpeedOutOfRangeException;

public class ValidationRules {
	//add constants for speed boundaries
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;	
	}
	//add a static method to validate speed of a vehicle
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException
	{
		//throw Throwable instance;
		if(speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow!!!!!");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("You are driving too fast , FATAL ");
		System.out.println("Speed withing range...");
	}
	
}
