public class Bank {
	private int 	accountNumber;
	private double	balance;
	private String 	name;
	private String 	email;
	private String 	phoneNumber;

	//Constructor for the fields, setters aren't need if constructors are used
	public Bank() {
		this(56789, 2.50, "default name", "default email", "default phone");
		System.out.println("Empty Constructor Called");
	}

	public Bank(int accountNumber, double balance, String name, String email, String phoneNumber){
		System.out.println("Bank constructor with parameters called");
		this.accountNumber 	= accountNumber;
		this.balance 		= balance;
		this.name 			= name;
		this.email 			= email;
		this.phoneNumber 	= phoneNumber;
	}

	// Constructor with some default values
	public Bank(String name, String email, String phoneNumber){
		this(99999, 100.55, name, email, phoneNumber);
		// this.name = name;
		// this.email = email;
		// this.phoneNumber = phoneNumber;
	}

	public int getAccountNumber(){
		return this.accountNumber;
	}

	public double getBalance(){
		return this.balance;
	}

	public String getName(){
		return this.name;
	}

	public String getEmail(){
		return this.email;
	}

	public String getPhoneNumber(){
		return this.phoneNumber;
	}

	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public double depositFunds(double depositAmount) {
		balance += depositAmount;
		System.out.println("New balance = $" + balance);
		return balance;
	}

	public double withdrawFunds(double withdrawalAmount){
		if(withdrawalAmount > balance){
			System.out.println("There are insufficient funds for the withdrawal amount of " + withdrawalAmount);
			return this.balance;
		}else {
			balance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " processed. New balance = $" + balance);
			return this.balance;
		}
	}
}