package org.jsp.rootclass;

public class ObjClassAss1
{
	public static void main(String[] args )
	{
		Car c1 = new Car("Swift",50000.79,"Silver");
		Car c2 = new Car("Alto",35000.50,"Red");
		if(c1.equals(c2))
		{
			System.out.println("Cars are same");
		}
		else
		{
			System.out.println("Cars are different");
		}
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
