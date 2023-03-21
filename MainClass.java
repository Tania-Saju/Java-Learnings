package org.jsp.interfaces;

public class MainClass {
	public static void main(String[] ags) {
		C c = new C();
		c.print();
		c.print(43);
		System.out.println(A.x);
		System.out.println(B.x);
		System.out.println(B.y);

	}
}
