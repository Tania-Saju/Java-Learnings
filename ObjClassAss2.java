package org.jsp.rootclass;

public class ObjClassAss2
{
	public static void main(String[] args)
	{
		Bottle b1 = new Bottle("cocacola","500ml");
		Bottle b2 = new Bottle("Sprite","250ml");
		if(b1.equals(b2))
		{
			System.out.println("Bottles contain same type & quantity");
		}
		else
		{
			System.out.println("Bottles contain different type & quantity");
		}
	}

}
