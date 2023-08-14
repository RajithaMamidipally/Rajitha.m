package day6;

public class CurrentAccount extends Account {
	int freeTrans = 3;
	int transactionCount = 0;
	int transRate = 100;
		public CurrentAccount(long acon, String name, float bal) {
			super(acon, name, bal);
			
		}
		
		@Override
		public void deposit(float amt) {
			transactionCount++;
			super.deposit(amt);
		}
		@Override
		public void withdraw(float amt) {
			transactionCount++;
			super.withdraw(amt);
		}
		@Override
		public void getBalance() {
			transactionCount++;
			super.getBalance();
		}
	   public void serviceCharge() {
		   int serviceChargeCount = transactionCount - freeTrans;
		   if(serviceChargeCount > 0 ) {
			   transactionCount = 0;
			   float amt = serviceChargeCount * transRate;
			   super.withdraw(amt); 
			  }else {
				  System.out.println("SERVICE CHARGE IS NOT APPLICABLE AT THIS TIME AS YOU"
				  		+ "HAVE DONE ONLY"+transactionCount+"/"+freeTrans);
			  }
	   }
		
	}


