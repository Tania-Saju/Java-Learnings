package org.jsp.rootclass;

public class Bottle
{
	private String type,qty;
	public Bottle(String type,String qty)
	{
		this.type = type;
		this.qty = qty;
	}
	@Override
	public boolean equals(Object obj)
	{
		Bottle b = (Bottle)obj;
		return this.type.equals(b.type) &&
				this.qty.equals(b.qty);
		
	}
}
