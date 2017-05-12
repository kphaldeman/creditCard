package creditCard;
 
public class CreditCard {
 
	private double balance	    = 00.00;
	private double interest     = 00.00;
	private CreditCardType type = null;
 
	public CreditCard(CreditCardType type) {
		this.type = type;
		setupCardFinances();
	}
 
	private void setupCardFinances() {
		// Do one time processing here
		this.interest = 0.15;  // default is in Bank's interest!
	}
	
	public double getBalance() {
		return this.balance;
	}
 
	public double getInterest() {
		return this.interest;
	}
	
	public CreditCardType getType() {
		return this.type;
	}
	
	public double chargeToCard(double newCharge) {
		this.balance += newCharge;
		return this.balance;
	}
	
	public double payOnCard(double payment) {
		this.balance -= payment;
		return this.balance;
	}
	
	public double calculateFinanceCharge() {
		double charge = this.balance * this.interest;
		return charge;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setInterest(double interest) {
		// Interest probably should only be set by the bank - not a public interface?
		this.interest = interest;
	}
	
	public void setType(CreditCardType type) {
		this.type = type;
	}
}
