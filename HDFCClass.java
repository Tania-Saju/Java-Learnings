package org.jsp.bank.application;

public class HDFCClass extends BankClass {
	double bal = 14000.00;

	public void disp() {
		System.out.println("Balance =   " + bal);
	}

	public void withdraw(double x) {
		System.out.println("withdrawn amt = " + x);
		bal = bal - x;
		System.out.println("balance amt = " + bal);

	}

	public void deposit(double y) {

		System.out.println("deposit amt = " + y);

	}
}
