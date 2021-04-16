public VipCustomer {

	private double creditLimit;
	private String name;
	private String emailAddress;

	public VipCustomer(){
		this(123400.00, "johnny", "johnny@email.com");
		System.out.println("Empty Constructor Called.");
	}
}