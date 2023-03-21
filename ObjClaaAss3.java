package org.jsp.rootclass;

public class ObjClaaAss3 
{
	public static void main(String[] args)
	{
		Watch w1 = new Watch(12,30);
		Watch w2 = new Watch(12,34);
		if(w1.equals(w2))
		{
			System.out.println("Hrs and mins of both watches are same");
		}
		else
		{
			System.out.println("Hrs and mins of both watches  are different");
		}
		
		System.out.println(w1);
		
	}

}
