package day6;

public class SavingsAccount extends Account {
	float roi;
	public SavingsAccount(long acon, String name, float bal ,float roi) {
		super(acon, name, bal);
		this.roi = roi;
		
	}

	 public void calculateInterest() {
		 float intrst = roi * this.getBal()/100;
		 super.deposit(intrst);
	 }
}
