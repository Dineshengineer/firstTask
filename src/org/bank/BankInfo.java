package org.bank;

public class BankInfo {
	private void savings() {
		System.out.println("savings percentage is 4");

	}

	private void fixed() {
		System.out.println("fixed percentage is 2");

	}

	public static void main(String[] args) {
		BankInfo c = new BankInfo();

		c.fixed();
		c.savings();
	}
}
