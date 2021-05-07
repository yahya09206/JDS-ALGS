public class Main3 {
	public static void main(String[] args){
		
		// Player player = new Player();
		// player.name = "Kim";
		// player.health = 20;
		// player.weapon = "Sword";

		// int damage = 10;
		// player.loseHealth(damage);
		// System.out.println("Remaining health = " + player.healthRemaining());

		// damage = 11;
		// player.health = 200;
		// player.loseHealth(damage);
		// System.out.println("Remaining health = " + player.healthRemaining());

		//Instance of Enhanced Player Class
		EnhancedPlayer player = new EnhancedPlayer("Kim", 200, "Sword");
		System.out.println("Remaining health = " + player.getHealth());

		Printer printer = new Printer(50, false);
		System.out.println("initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
		

	}
}