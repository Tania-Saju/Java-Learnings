package org.jsp.interfaces;

public class IClass1 implements Intr1, Intr2 {
	public void print() {
		System.out.println(Intr2.y);
	}

	public void disp() {
		System.out.println(Intr1.x);
	}
}
