package week2.day2;

public class car 
{
	void applyBreak()
	{
		System.out.println("Break1");
	}
	void applyGear()
	{
		System.out.println("gear");
		
	}
void switchOnAC()
{
	System.out.println("Ac");
	
}
	void applyAccelerator()
	{
		System.out.println("Acceleration");
	}
	
	public static void main(String args[])
	{
		car car=new car();
		car.applyBreak();
		car.applyGear();
		car.switchOnAC();
		car.applyAccelerator();
	}
}
