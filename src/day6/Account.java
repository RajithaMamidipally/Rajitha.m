package day6;

public class Account {
	 private long acon;
	    private String name;
	    private float bal;
		public Account(long acon, String name, float bal) {
			this.acon = acon;
			this.name = name;
			this.bal = bal;
		}
		
	      public float getBal() {
			return bal;
		}

		public void deposit(float amt) {
	    	  this.bal += amt;
	    	  System.out.println("Rs."+amt+"Credited | Balance: " + this.bal);
	      }
	      public void withdraw(float amt) {
	    	  if(this.bal >= amt) {
	    		  this.bal = this.bal - amt;
	    		  System.out.println("Rs."+amt+"Debited | Balance: "+this.bal);
	    	  }else{
	    		  System.err.println("ERROR: INSUFFICIENT BALANCE");
	    	  }
	      }
	     public void getBalance() {
	    	 System.out.println("A/C NO: "+ this.acon + " | NAME: "+ this.name + " |BALANCE:" + this.bal);
	     }
	}



