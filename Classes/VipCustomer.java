public VipCustomer {

	private double creditLimit;
	private String name;
	private String emailAddress;

	public VipCustomer(){
		this(123400.00, "johnny", "johnny@email.com");
		System.out.println("Empty Constructor Called.");
	}

	public VipCustomer(double creditLimit, double name){
		this("johnny@email.com", creditLimit, name);
	}

	public VipCustomer(double creditLimit, String name, String emailAddress){
		this.creditLimit 	= creditLimit;
		this.name 			= name;
		this.emailAddress 	= emailAddress;
	}

	public double getCreditLimit(){
		return this.creditLimit;
	}

	public String getName(){
		return this.name;
	}

	public String getEmailAddress(){
		return this.emailAddress;
	}
}