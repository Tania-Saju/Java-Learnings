package org.jsp.rootclass;

public class Watch
{
	private int hh,mm;
	public Watch(int hh,int mm)
	{
		this.hh = hh;
		this.mm = mm;
		
	}
@Override
public String toString()
	{
		return hh+":"+mm;
	}
public boolean equals(Object obj)
{
	Watch w = (Watch)obj;
	return this.hh == w.hh &&
			this.mm == w.mm;

}
}

