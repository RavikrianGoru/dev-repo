package com.javatpoint.enumarations;

//You can add fields to a Java enum. Thus, each constant enum value gets these fields. 
//The field values must be supplied to the constructor of the enum when defining the constants.
enum Season {
	WINTER, SPRING, SUMMER, FALL;
}

enum DaysOfWeek {
	SON(0), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6);
	public int value;
	private DaysOfWeek(int value)
	{
		this.value=value;
	}
}

enum LevelEnum {
	HIGH(3), // calls constructor with value 3
	MEDIUM(2), // calls constructor with value 2
	LOW(1) // calls constructor with value 1
	; // semicolon needed when fields / methods follow

	private final int levelCode;

	private LevelEnum(int levelCode) {
		this.levelCode = levelCode;
	}

	public int getLevelCode() {
		return this.levelCode;
	}

}

public class LevelEnumTest {

	public static void main(String[] args) {

		System.out.println("Season...........................");
		for (Season s : Season.values()) {
			System.out.println(s);
		}

		LevelEnum level=LevelEnum.LOW;
		System.out.println("level:"+level);
		System.out.println("name():"+level.name());
		System.out.println("Ordinal:"+level.ordinal());
		System.out.println("toString():"+level.toString());
		System.out.println("getClass():"+level.getClass());
		System.out.println("getDeclareingClass():"+level.getDeclaringClass());
		System.out.println("user defined method getLevelCode():"+level.getLevelCode());
		
		System.out.println("Days Of Week.....................");
		for (DaysOfWeek dow : DaysOfWeek.values()) {
			System.out.println(dow+"   "+dow.value);
		}
		DaysOfWeek d=DaysOfWeek.MON;
		System.out.println("d.value:"+d.value);
		

	}

}
