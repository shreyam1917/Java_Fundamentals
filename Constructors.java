package Oops;

public class Constructors {
	public String name;
	private int RollNumber;

	public Constructors(String n , int roll)
	{
		name=n;
		RollNumber=roll;
	}
	public int getRollNumber()
	{
		if(RollNumber<0)
		{
			return -1;
		}
		else
		return RollNumber;
	}
}
