package org.jsp.interfaces;

public class IClass implements Intr3 {
	public void disp() {
		System.out.println(Intr1.x);
	}

	public void disp(double d) {
		System.out.println("x = " + Intr3.x);
		System.out.println("y = " + Intr3.y);
		System.out.println("z = " + Intr3.z);

	}

	public void print() {
		System.out.println(Intr2.y);
	}
}
