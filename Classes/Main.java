import java.util.*;
public class Main {
	public static void main(String[] args){
		//Car Class
		Car porsche = new Car();
		Car ford = new Car();
		porsche.setModel("Carrera");
		System.out.println("Model is " + porsche.getModel());

		//Bank Class
		Bank john = new Bank(); //(12345, 0.00, "John Brown", "myemail@john.com", "(206) 123 - 4567"); // Will call empty constructor if not filled with info
		System.out.println(john.getAccountNumber());
		john.setBalance(100.00);
		System.out.println(john.getBalance());
		john.depositFunds(10.0);
		System.out.println(john.getBalance());
		System.out.println(john.getBalance());
		john.withdrawFunds(110);
		john.withdrawFunds(140);

		Bank timsBank = new Bank("Tim", "Tim@emai.com", "12345");
		System.out.println(timsBank.getAccountNumber() + " name " + timsBank.getName());

		// Constructor Challenge
		VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getName());

		VipCustomer person2 = new VipCustomer(25000.00, "Bob");
		System.out.println(person2.getName());

		VipCustomer person3 = new VipCustomer(100.00, "Bob", "Bob@email.com");
		System.out.println(person3.getName());
		System.out.println(person3.getEmailAddress());
	}
}