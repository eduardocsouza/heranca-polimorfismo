package entites;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	
	public BusinessAccount() {
	}


	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}


	public Double getInterestRate() {
		return loanLimit;
	}


	public void setInterestRate(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
	public void loan(Double amount) {
		if(amount <= balance) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	@Override
	public final String toString() { //a palavra final serve para evitar que o método ou a class seja reutilizada
		return "Total: " + balance;
	}
}
