public class Bank {
	private int accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;

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
			System.out.println("there are insufficient funds");
			return this.balance;
		}else {
			balance -= withdrawalAmount;
			System.out.println("New balance = $" + balance);
			return this.balance;
		}
	}
}