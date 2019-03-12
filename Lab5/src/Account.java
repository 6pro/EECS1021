

public class Account {

	double bal;
	String name;
	char type;

	// Account name, type of account and initial balance of account
	Account(String name, char type, double bal) {
		this.name = name;
		this.type = type;
		this.bal = bal;
	}

	// Account name, type of account and initial balance of account is 0.0
	Account(String name, char type) {
		this.name = name;
		this.type = type;
		this.bal = 0.0;
	}

	//Gets the accounts balance description
	String getDescription() {
		String description = "";
		
		if (this.type == 'i') {
			description = "International account with owner " + this.name + " has current balance $" + this.bal; 
		}
		else {
			description = "Domestic account with owner " + this.name + " has current balance $" + this.bal;
		}
		
		return description;
	}
	
	//Gets the balance
	double getBalance() {
		
		return this.bal;
	}
	
	//Set the balance
	void setBalance(double bal) {
		
		this.bal = bal;
		
	}
	
	//Deposit money into account
	void deposit(double amount) {
		
		if (this.type == 'i') {
			amount = amount - (amount * 0.10);
			this.bal = this.bal + amount;
		}
		else {
			this.bal = this.bal + amount;
		}
	}
	
	//Withdraw money from account
	void withdraw(double amount) {
		
		if (this.type == 'i') {
			amount = amount + (amount * 0.10);
			this.bal = this.bal - amount;
		}
		else {
			this.bal = this.bal - amount;
		}
	}
	
	//Transfer money from one account to another
	void transferTo(Account other, double amount) {
		double temp = amount;
		
		if (this.type == 'i' && other.type == 'd') { //Transfering from int to dom
			other.bal = other.bal + amount;
			amount = amount + (amount * 0.10);
			this.bal = this.bal - amount;
		}
		else if (this.type == 'd' && other.type == 'i') {
			this.bal = this.bal - amount;
			amount = amount - (amount * 0.10);
			other.bal = other.bal + amount;
		}
		else if (this.type == 'i' && other.type == 'i') {//Transfering from int to int
			temp = temp + (temp * 0.10);
			this.bal = this.bal - temp;
			amount = amount - (amount * 0.10);
			other.bal = other.bal + amount;
		}
		else {
			other.bal = other.bal + amount;
			this.bal = this.bal - amount;
		}
	}
	
	
}
