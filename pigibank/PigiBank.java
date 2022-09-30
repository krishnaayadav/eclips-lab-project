package varargs;

public class PigiBank {
	private int srno;
	private String name;
	private double balance;

	PigiBank() {
		srno = 01;
		name = "Unknown";
		balance = 00.00;
	}

	public PigiBank(int srno, String name) {
		this.srno = srno;
		this.name = name;
		this.balance = 50.00;
	}

	public PigiBank(int srno, String name, double balance) {
		this.srno = srno;
		this.name = name;
		this.balance = balance;
	}

	void deposite(double amt) {
		double money =+amt;
		System.out.println("The balance for :" + this.name + "has been added by :Rs" + amt);
		System.out.println("Total balance is :Rs" + this.balance);
	}

	void printPigiBank() {
		System.out.println("SrNo. :" + this.srno);
		System.out.println("Name :" + this.name);
		System.out.println("Amount. :" + this.balance);
	}

}
