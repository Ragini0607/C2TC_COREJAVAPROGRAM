package day2;

public class DecisionMakingWithOperators 
{

	public static void main(String[] args)
	{
		int x = 38, y = 27;
		int a = 67;
		int b = 71;

		if (x >= y)
		{
			System.out.println("TRUE");
		}
		else 
		{
			System.out.println("FALSE");
		}

		if (!(a < b) || (a == b))
		{
			System.out.println("Condition is TRUE");
		} 
		else
		{
			System.out.println("Condition is FALSE");
		}
	}

}
