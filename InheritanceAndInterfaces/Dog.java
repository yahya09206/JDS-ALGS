public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight){
		//Super calls constructor from class we are inherting from
		super(name, 1, 1, size, weight);
	}
}