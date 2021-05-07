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
	}
}