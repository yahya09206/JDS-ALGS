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
	}
}