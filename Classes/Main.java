import java.util.*;
public class Main {
	public static void main(String[] args){
		Car porsche = new Car();
		Car ford = new Car();
		porsche.setModel("Carrera");
		System.out.println("Model is " + porsche.getModel());

		Bank john = new Bank();
		john.setBalance(100.00);
		System.out.println(john.getBalance());
		john.depositFunds(10.0);
		System.out.println(john.getBalance());
		john.withdrawFunds(140);
		System.out.println(john.getBalance());
	}
}