import java.util.Date;
public class Account {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated;
	
	Account (){
		dateCreated = new Date();
	}
	
	Account (int id, double balance){
		dateCreated = new Date();
		this.id = id;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}
	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if (amount <= balance) {
		balance -= amount;
		} else { 
			System.out.println("Insufficient funds");
		}
	}
	
	
}


