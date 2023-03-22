package org.jsp.rootclass;

public class Car
{
	private String colour,name;
	private double price;
	public Car(String name,double price,String colour)
	{
		this.name = name;
		this.price = price;
		this.colour = colour;
	}

	@Override
	public boolean equals(Object obj)
	{
		Car c = (Car)obj;
		
		return this.name.equals(c.name) && 
				this.colour.equals(c.colour)&&
				this.price == c.price;
	}
	
	@Override
	public String toString()
	{
		return name+"\t"+colour+"\t"+price;
	}
}
